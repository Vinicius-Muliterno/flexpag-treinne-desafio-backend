package com.flexpag.paymentscheduler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peding")
public class pendingController {

	
	@GetMapping
	public String olaMundo() {		
		return "teste do salvamento automatico";
	}
	
}
