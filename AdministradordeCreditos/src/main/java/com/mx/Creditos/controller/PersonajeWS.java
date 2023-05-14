package com.mx.Creditos.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Creditos.request.Creditos;
import com.mx.Creditos.request.Plazos;
import com.mx.Creditos.request.Producto;
import com.mx.Creditos.service.PlazoClient;
import com.mx.Creditos.service.ProductClient;



@RestController
@RequestMapping("api/creditos")
public class PersonajeWS {
	@Autowired
	  ProductClient productClient;
	@Autowired
	  PlazoClient plazoClient;

	public PersonajeWS(ProductClient productClient, PlazoClient plazoClient) {
		this.productClient = productClient;
		this.plazoClient = plazoClient;
	}

	@GetMapping("/cita")
	public Creditos getQuote(@RequestParam("productId") Long productId, @RequestParam("plazoId") Long plazoId) {
		Producto product = productClient.getProductById(productId);
		Plazos plazo = plazoClient.getPlazoById(plazoId);
		BigDecimal abonoNormal = product.getPrecio().multiply(plazo.getTasaNormal()).add(product.getPrecio()).divide(BigDecimal.valueOf(plazo.getSemanas()), RoundingMode.HALF_UP);
		BigDecimal abonoPuntual = product.getPrecio().multiply(plazo.getTasaPuntual()).add(product.getPrecio()).divide(BigDecimal.valueOf(plazo.getSemanas()), RoundingMode.HALF_UP);
		return new Creditos(product, plazo, abonoNormal, abonoPuntual);
	}
}