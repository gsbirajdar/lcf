package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
	
	@Autowired
	private ActivityService service;
	
	@RequestMapping("/")
	public String create() {
		//String response = service.create(request);
		return "it is working";
	}

}
