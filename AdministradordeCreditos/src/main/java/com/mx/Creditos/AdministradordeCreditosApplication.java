package com.mx.Creditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AdministradordeCreditosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministradordeCreditosApplication.class, args);
	}

}
