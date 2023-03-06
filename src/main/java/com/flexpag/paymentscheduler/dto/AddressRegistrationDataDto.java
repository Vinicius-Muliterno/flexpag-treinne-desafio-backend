package com.flexpag.paymentscheduler.dto;

public record AddressRegistrationDataDto(
		
		long zip,
		String street,
		String neighborhood,
		String city,
		String uf,
		int number,
		String Complement
		) {

}
