package com.mx.Creditos.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.Creditos.request.Plazos;


@Component
@FeignClient("microservicio-Plazos")
public interface PlazoClient {

    @GetMapping("api/plazos/{id}")
    Plazos getPlazoById(@PathVariable Long id);
}
