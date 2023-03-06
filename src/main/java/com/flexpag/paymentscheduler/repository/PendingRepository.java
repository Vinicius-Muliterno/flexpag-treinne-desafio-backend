package com.flexpag.paymentscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flexpag.paymentscheduler.entities.pending;

public interface PendingRepository extends JpaRepository<pending, Long>{

}
