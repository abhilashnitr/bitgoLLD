package com.bitgo.demo.service;

import com.bitgo.demo.NotificationException;
import com.bitgo.demo.entity.Notification;
import com.bitgo.demo.repo.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    NotificationRepo notificationRepo;

    public Notification createNotifaction(Notification notification) throws NotificationException {
        return notificationRepo.save(notification);
    }

    public void sendNotification(List<String> emailIds, Long notificationId) {
        Notification notification = notificationRepo.findById(notificationId);
        for(String emails:emailIds){
          System.out.println("Notification Sent for Mail id :"+emails+"and Notificaiton "+notification);
        }
    }

    public Notification updateNotification(Notification notification) throws NotificationException  {
        Notification notificationInDb = notificationRepo.findById(notification.getId());
        notificationInDb.setPctChange(notification.getPctChange());
        notificationInDb.setPrice(notification.getPrice());
        notificationInDb.setTradingVolume(notification.getTradingVolume());
        return notificationRepo.save(notificationInDb);
    }

    public Notification deleteNotification(Notification notification) throws NotificationException {
        return notificationRepo.remove(notification.getId());
    }
}
