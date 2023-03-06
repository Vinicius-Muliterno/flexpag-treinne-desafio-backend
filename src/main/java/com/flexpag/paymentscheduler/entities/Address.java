package com.flexpag.paymentscheduler.entities;

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
	
}
