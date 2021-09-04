package com.BiCycleParts.bicycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

// 1. Application - provided by Spring boot
@SpringBootApplication
public class BicycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BicycleApplication.class, args);
	}
}