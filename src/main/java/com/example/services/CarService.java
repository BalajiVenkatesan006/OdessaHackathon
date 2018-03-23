package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Car;
import com.example.repositories.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public void addCar(Car car) {
    	carRepository.save(car);
	}
    
    public Iterable<Car> getCars(){
    	return carRepository.findAll();
	}
}
