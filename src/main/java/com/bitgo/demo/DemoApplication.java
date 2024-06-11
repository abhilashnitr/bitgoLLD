package com.bitgo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Create a crypto notification service as an HTTP Rest API server
Create a Notification (Input parameters: Current Price of Bitcoin, Daily Percentage Change, Trading Volume, etc)
Send a notification to email/emails
List notifications (Sent, Pending, Failed)
Update/Delete notification
* */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
