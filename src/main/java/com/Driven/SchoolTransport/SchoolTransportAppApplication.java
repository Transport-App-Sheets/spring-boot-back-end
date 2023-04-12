package com.Driven.SchoolTransport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.Driven.SchoolTransport.model")
@SpringBootApplication
public class SchoolTransportAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolTransportAppApplication.class, args);
		System.out.println("hello guuys");
	}

}
