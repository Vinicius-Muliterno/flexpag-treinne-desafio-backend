package com.flexpag.paymentscheduler.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserRegistrationDataDto(
		
		@NotBlank
		String name,
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		@Pattern (regexp = "\\d{11}")
		String telephone,
		
		
		AddressRegistrationDataDto address
		) {

}
