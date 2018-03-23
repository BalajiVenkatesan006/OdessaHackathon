package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue
	private Long paymentId;
	private Double amount;
	
	
	public Payment() {
	}
	public Payment(Long paymentId, Double amount) {
		this.paymentId = paymentId;
		this.amount = amount;
	}
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
