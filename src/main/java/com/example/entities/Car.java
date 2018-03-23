package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private String vehicleNumber;
	private String type;
	private Double price;
	private Integer seats;
	private String status;
	public Car() {
	}
	public Car(String vehicleNumber, String type, Double price, Integer seats, String status) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.price = price;
		this.seats = seats;
		this.status = status;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}