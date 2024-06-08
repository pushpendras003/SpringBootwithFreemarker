package com.practice.email;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.email.dto.MailRequest;
import com.practice.email.dto.MailResponse;
import com.practice.email.service.EmailService;

@SpringBootApplication
@RestController
public class SpringBootEmailWithTemplateApplication {
	
	@Autowired
	private EmailService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailWithTemplateApplication.class, args);
	}
	
	@PostMapping("/sendingEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		
		System.out.println("response is coming in send email service");
		System.out.println(request);
		Map<String,Object> model= new HashMap<>();
		 model.put("Name", request.getName());
		 model.put("location", "Gurgram, India");
		 return service.sendEmail(request,model);
	}
	
	

}
