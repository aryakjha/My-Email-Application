package com.venture.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.venture.demo.model.EmailDetails;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
//	@Value("${spring.mail.username}")
	private String sender = "ganeshpillai700@gmail.com";
	
	public String simpleEmail(EmailDetails emailDetails) {
		
		try {
			SimpleMailMessage simple = new SimpleMailMessage();
			
			
			simple.setFrom(sender);
			simple.setTo(emailDetails.getTo());
			simple.setText(emailDetails.getMsgBody());
			simple.setSubject(emailDetails.getSubject());
			
			
			javaMailSender.send(simple);
			return "Message Sent";
			
		}
		catch(Exception e) {
//			System.out.println(e);
			e.printStackTrace();
			return "Error while sending mail";
		}
	}
	
	
}
