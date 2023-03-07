package com.flexpag.paymentscheduler.dto;

public record AddressRegistrationDataDto(
		
		String zip,
		String street,
		String neighborhood,
		String city,
		String uf,
		String number,
		String Complement
		) {

}
