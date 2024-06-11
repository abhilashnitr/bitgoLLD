package com.bitgo.demo.Controller;

import com.bitgo.demo.NotificationException;
import com.bitgo.demo.dto.NotificationResponse;
import com.bitgo.demo.entity.Notification;
import com.bitgo.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/create")
    public NotificationResponse createNotification(@RequestBody Notification notification){
        NotificationResponse response = new NotificationResponse();
        try{
            Notification entry = notificationService.createNotifaction(notification);
            response.setNotification(entry);
            response.setMessage("Notification created Successfully");
            response.setStatusCode(200);
          }
        catch (NotificationException ex){
            response.setMessage("Exception occured while creating Notification");
            response.setStatusCode(500); // custom status code
        }
        return response;

    }

    @PutMapping("/update")
    public NotificationResponse updateNotification(@RequestBody Notification notification){
        NotificationResponse response = new NotificationResponse();
        try{
            Notification entry = notificationService.updateNotification(notification);
            response.setNotification(entry);
            response.setMessage("Notification updated Successfully");
            response.setStatusCode(200);
        }
        catch (NotificationException ex){
            response.setMessage("Exception occured while creating Notification");
            response.setStatusCode(500); // custom status code
        }
        return response;

    }

    @DeleteMapping("/delete")
    public NotificationResponse deleteNotification(@RequestBody Notification notification){
        NotificationResponse response = new NotificationResponse();
        try{
            Notification entry = notificationService.deleteNotification(notification);
            response.setNotification(entry);
            response.setMessage("Notification updated Successfully");
            response.setStatusCode(200);
        }
        catch (NotificationException ex){
            response.setMessage("Exception occured while creating Notification");
            response.setStatusCode(500); // custom status code
        }
        return response;

    }

    @PostMapping("/send")
    public String sendNotification(@RequestParam List<String> emailIds, @RequestParam Long notificationId){
        notificationService.sendNotification(emailIds,notificationId);
        return "Notification Sent";
    }
}
