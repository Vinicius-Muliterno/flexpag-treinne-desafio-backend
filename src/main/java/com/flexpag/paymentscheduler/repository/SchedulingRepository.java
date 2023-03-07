package com.flexpag.paymentscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flexpag.paymentscheduler.entities.Scheduling;

public interface SchedulingRepository extends JpaRepository<Scheduling, Long>{

}
