package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Payment;
import com.example.repositories.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
    PaymentRepository paymentRepository;
    
    public void addPayment(Payment payment) {
    	paymentRepository.save(payment);
	}
    
    public Iterable<Payment> getPayments(){
    	return paymentRepository.findAll();
	}
}
