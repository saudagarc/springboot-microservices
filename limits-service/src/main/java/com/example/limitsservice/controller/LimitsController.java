package com.example.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservice.config.LimitServiceConfig;
import com.example.limitsservice.model.LimitService;

@RestController
public class LimitsController {
	@Autowired
	LimitServiceConfig config;
	
	@GetMapping("/limits")
	public LimitService getLimits() {
		System.out.println("In limits controller::"+config.toString());
		return new LimitService(config.getMinimum(), config.getMaximum())	;
	}

}
