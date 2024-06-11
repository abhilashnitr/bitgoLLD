package com.bitgo.demo.dto;

import com.bitgo.demo.entity.Notification;


public class NotificationResponse {

    private Notification notification;
    private String message ;
    private Integer statusCode;

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}

