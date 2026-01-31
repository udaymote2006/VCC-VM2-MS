package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Added to handle web requests
public class Demo2Application {

	public static void main(String[] args) {
		// Run Demo2 on port 8081
		System.setProperty("server.port", "8081");
		SpringApplication.run(Demo2Application.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Demo2 Microservice running on VM-2!";
	}
}