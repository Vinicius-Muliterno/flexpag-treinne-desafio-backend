package com.flexpag.paymentscheduler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flexpag.paymentscheduler.dto.ListUsersDto;
import com.flexpag.paymentscheduler.dto.UpdateUsersDto;
import com.flexpag.paymentscheduler.dto.UserRegistrationDataDto;
import com.flexpag.paymentscheduler.entities.Useres;
import com.flexpag.paymentscheduler.repository.UseresRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;


@RestController
@RequestMapping ("/useres")
public class UseresController {
	
	@Autowired
	private UseresRepository repository;
	
	@PostMapping
	@Transactional
	public void registerUser(@RequestBody @Valid UserRegistrationDataDto data) {
		repository.save(new Useres(data));
	}
	
	
	@GetMapping
	public List<ListUsersDto> listUsers(){
		return repository.findAll().stream().map(ListUsersDto::new).toList();
	}
	
	@PutMapping
	@Transactional
	public void update(@RequestBody @Valid UpdateUsersDto data) {
		var useres = repository.getReferenceById(data.id());
		useres.updateUseres(data);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void delete(@PathVariable Long id) { 
		repository.deleteById(id);
	}
	
	
	
}
