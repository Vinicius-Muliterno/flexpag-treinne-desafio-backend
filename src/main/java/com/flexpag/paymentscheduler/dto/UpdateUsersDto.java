package com.flexpag.paymentscheduler.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UpdateUsersDto(

		@NotNull
		long id ,
		
		String name,
		@Email
		String email,
		@Pattern (regexp = "\\d{11}")
		String telephone,
		
		
		AddressRegistrationDataDto address
		) {


}
