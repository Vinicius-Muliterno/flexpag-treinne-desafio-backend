package com.flexpag.paymentscheduler.entities;

import com.flexpag.paymentscheduler.dto.AddressRegistrationDataDto;

import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private long zip;
	private String street;
	private String neighborhood;
	private String city;
	private String uf;
	private int number;
	private String Complement;
	
	public Address(AddressRegistrationDataDto data) {
		this.zip = data.zip();
		this.street = data.street();
		this.neighborhood =data.neighborhood();
		this.city = data.city();
		this.uf = data.uf();
		this.number = data.number();
		this.Complement = data.Complement();
				
				
	}
	
}
