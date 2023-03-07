package com.flexpag.paymentscheduler.entities;

import com.flexpag.paymentscheduler.dto.UpdateUsersDto;
import com.flexpag.paymentscheduler.dto.UserRegistrationDataDto;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
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
	private String telephone;
	@Embedded
	private Address address;
	
//	@OneToMany
//	private Scheduling scheduling;
	
	public Useres(UserRegistrationDataDto data) {
		this.name = data.name();
		this.email = data.email();
		this.telephone = data.telephone();
		this.address = new Address(data.address());
		
	}

	public void updateUseres(@Valid UpdateUsersDto data) {
		
		if (data.name() != null) {
			this.name = data.name();
		}
		if (data.email() != null) {
			this.email = data.email();
		}
		if (data.telephone() != null) {
			this.telephone = data.telephone();
		}
		
		
		
	}
}
