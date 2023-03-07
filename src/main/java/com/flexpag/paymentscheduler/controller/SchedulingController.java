package com.flexpag.paymentscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flexpag.paymentscheduler.repository.SchedulingRepository;

@RestController
@RequestMapping("/scheduling")
public class SchedulingController {

	@Autowired
	private SchedulingRepository repository;
	
	
//	@GetMapping
//	public long registerPeding(Date appointmentData){
//		repository.save(Date)		
//	}
	
}
