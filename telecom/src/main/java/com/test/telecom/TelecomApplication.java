package com.test.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.test.telecom.*")

public class TelecomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelecomApplication.class, args);
	
	}

	
	
	
}
