package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailSendindApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailSendindApplication.class, args);
	}

	@Autowired
	private EmailSenderService service;

	

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		 // with attachement
		
		  service.sendEmailWithAttachment("hussainmansoori659@gmail.com",
		  "This is Email Body with Attachment...", "This email has attachment",
		  "C:\\Users\\admin\\Pictures\\Screenshots\\demo.png");
		 
 
		
		
		 // without attachement
	//	service.sendSimpleEmail("hussainmansoori659@gmail.com", "Hi Hussain ", "SpringBoot Mail Triggered");
	}
}
