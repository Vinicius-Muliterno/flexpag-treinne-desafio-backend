package com.flexpag.paymentscheduler.dto;

public record UserRegistrationDataDto(
		
		String name,
		String email,
		long telephone,
		AddressRegistrationDataDto address
		) {

}
