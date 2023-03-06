package com.flexpag.paymentscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flexpag.paymentscheduler.repository.UseresRepository;


@RestController
@RequestMapping ("/user")
public class UseresController {
	
	@Autowired
	private UseresRepository repository;
	
	
	@PostMapping
	public void registerUser(@RequestBody String json) {
		System.out.println(json);
	}
	

}
