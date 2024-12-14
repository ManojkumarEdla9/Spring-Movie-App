package com.example.Application;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
@Configuration
public class MailConfig {
	
	
//
//	public String findusers() {
//		ArrayList<String>al=new ArrayList<>();
//		al.add(1, JavaMailSender);
//		System.out.println("emails.findusers(manoj@gmail.com)");
//		al.add(2, JavaMailSender);
//		System.out.println("emails.findusers(mahesh@yahoo.com)");
//		al.add(3, JavaMailSender);
//		System.out.println("emails.findusers(prabhas@yahoo.com)");
//		return null;
//	} 
@Bean
public JavaMailSender javaMailSender()
{
	JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
	mailSender.setHost("smtp.example.com");
	mailSender.setPort(587);
	mailSender.setUsername("your email@Example.com");
	mailSender.setPassword("your password");
	
	Properties props=mailSender.getJavaMailProperties();
	props.put("mail.transport.protocol", "smtp");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttis.enable", "true");
	props.put("mail.debug", "true");
	
	return mailSender;
}
}
