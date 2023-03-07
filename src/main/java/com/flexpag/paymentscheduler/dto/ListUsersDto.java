package com.flexpag.paymentscheduler.dto;

import com.flexpag.paymentscheduler.entities.Useres;

public record ListUsersDto(
		
		long id,
		String name,
		String email,
		String telephone
		) {
	
	public ListUsersDto(Useres useres) {
		this(useres.getId(),
			 useres.getName(),
			 useres.getEmail(),
			 useres.getTelephone());
		
		
	}

}
