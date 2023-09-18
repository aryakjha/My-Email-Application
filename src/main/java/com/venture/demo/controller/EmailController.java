package com.venture.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venture.demo.model.EmailDetails;
import com.venture.demo.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendSimple")
	public String sendSimpleEmail(@RequestBody EmailDetails emailDetails){
		
		System.out.println(emailDetails);
		String status = emailService.simpleEmail(emailDetails);
		
		return status;
	}

}
