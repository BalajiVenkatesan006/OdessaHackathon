package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Car;

public interface CarRepository extends JpaRepository<Car, String> {
	
}
