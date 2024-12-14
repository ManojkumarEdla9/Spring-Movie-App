package com.example.emailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendwelcomeEmail(User user)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setSubject("Welcome to our Application : ");
		message.setText("user "+user.getName()+",\n\n welcome to our application,we are glad to have you with us. ");
		
	javaMailSender.send(message);	
	
	}
}
