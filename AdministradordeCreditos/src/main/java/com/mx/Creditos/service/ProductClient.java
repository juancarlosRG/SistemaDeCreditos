package com.mx.Creditos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.Creditos.request.Producto;



@FeignClient("microservicio-Productos")
@Service
public interface ProductClient {
	
    @GetMapping("api/producto/{id}")
    Producto getProductById(@PathVariable Long id);
}
