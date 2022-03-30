package com.atifimal.microservices.basic.convertorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConvertorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertorServiceApplication.class, args);
	}

}
