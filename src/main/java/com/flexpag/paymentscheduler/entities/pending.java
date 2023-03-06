package com.flexpag.paymentscheduler.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table (name = "pending")
@Data
public class pending {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	private Date scheduling;
	@Enumerated(EnumType.STRING)
	private StatusPending statusPending = StatusPending.PENDING ;
	
}