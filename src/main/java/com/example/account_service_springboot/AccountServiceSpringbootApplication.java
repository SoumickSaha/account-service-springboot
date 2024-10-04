package com.example.account_service_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceSpringbootApplication.class, args);
	}

}
