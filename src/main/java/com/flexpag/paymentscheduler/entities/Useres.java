package com.flexpag.paymentscheduler.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "Useres")
@Table (name = "useres")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Useres {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String name;
	private String email;
	private long telephone;
	@Embedded
	private Address address;
	
	
}
