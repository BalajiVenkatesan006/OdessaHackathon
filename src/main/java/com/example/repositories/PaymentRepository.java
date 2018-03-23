package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
