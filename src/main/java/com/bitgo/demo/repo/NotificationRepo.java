package com.bitgo.demo.repo;

import com.bitgo.demo.entity.Notification;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Component
public class NotificationRepo {

    Map<Long,Notification> map = new HashMap<>();
    private Long id = 1L;
    public Notification save(Notification notification){
        notification.setId(id);
        map.put(id,notification);
        id++;
        return notification;
    }

    public Notification findById(Long notificationId) {
        return map.get(notificationId);
    }

    public Notification remove(Long notificationId) {
        return map.remove(notificationId);
    }
}
