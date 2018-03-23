package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entities.Car;
import com.example.services.CarService;

@SpringBootApplication
@ComponentScan("com.example")
@EnableJpaRepositories("com.example.repositories")
@EntityScan("com.example.entities")
public class VehicleLeasingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VehicleLeasingApplication.class, args);
	}

	@Autowired
	private CarService carService;
	
	@Override
	public void run(String... args) throws Exception {
		carService.addCar(new Car("TN 37 A 1908", "SUV1", 1500.0, 5, "AVAILABLE"));
		carService.addCar(new Car("TN 54 A 1909", "SUV1", 1400.0, 5, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1901", "SUV2", 1600.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 29 A 1902", "SUV2", 1200.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 27 A 1903", "SUV3", 1000.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1904", "SUV3", 1500.0, 5, "AVAILABLE"));
		carService.addCar(new Car("TN 23 A 1905", "SEDAN1", 1500.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 18 A 1906", "SEDAN1", 1800.0, 8, "AVAILABLE"));
		carService.addCar(new Car("TN 14 A 1907", "SEDAN2", 1500.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1910", "SEDAN2", 1500.0, 5, "AVAILABLE"));
		carService.addCar(new Car("TN 09 A 1911", "SEDAN3", 800.0, 5, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1912", "SEDAN3", 1500.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1913", "SEDAN4", 900.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 11 A 1914", "SEDAN4", 1500.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 25 A 1915", "SEDAN5", 600.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 36 A 1916", "SEDAN5", 1500.0, 7, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1917", "HATCHBAG1", 900.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1918", "HATCHBAG1", 1500.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 66 A 1919", "HATCHBAG2", 1300.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 40 A 1920", "HATCHBAG2", 1500.0, 4, "AVAILABLE"));
		carService.addCar(new Car("TN 39 A 1921", "HATCHBAG3", 1800.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 37 A 1922", "HATCHBAG3", 1500.0, 7, "AVAILABLE"));
		carService.addCar(new Car("TN 33 A 1923", "HATCHBAG4", 1700.0, 6, "AVAILABLE"));
		carService.addCar(new Car("TN 01 A 1924", "HATCHBAG4", 1500.0, 6, "AVAILABLE"));
	}
}
