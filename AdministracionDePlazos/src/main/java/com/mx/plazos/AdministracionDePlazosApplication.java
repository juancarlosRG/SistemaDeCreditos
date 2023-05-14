package com.mx.plazos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AdministracionDePlazosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministracionDePlazosApplication.class, args);
	}

}
