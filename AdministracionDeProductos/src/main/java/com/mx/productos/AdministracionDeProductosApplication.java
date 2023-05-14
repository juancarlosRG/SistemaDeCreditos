package com.mx.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AdministracionDeProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministracionDeProductosApplication.class, args);
	}

}
