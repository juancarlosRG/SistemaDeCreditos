package com.mx.Creditos.request;

import java.math.BigDecimal;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class Creditos {
	
	private Producto product;
    private Plazos plazo;
    private BigDecimal abonoNormal;
    private BigDecimal abonoPuntual;
	public Creditos(Producto product, Plazos plazo, BigDecimal abonoNormal, BigDecimal abonoPuntual) {
		this.product = product;
		this.plazo = plazo;
		this.abonoNormal = abonoNormal;
		this.abonoPuntual = abonoPuntual;
	}
	public Creditos(Producto product) {
		this.product = product;
	}
	public Creditos() {
	}
	public Producto getProduct() {
		return product;
	}
	public void setProduct(Producto product) {
		this.product = product;
	}
	public Plazos getPlazo() {
		return plazo;
	}
	public void setPlazo(Plazos plazo) {
		this.plazo = plazo;
	}
	public BigDecimal getAbonoNormal() {
		return abonoNormal;
	}
	public void setAbonoNormal(BigDecimal abonoNormal) {
		this.abonoNormal = abonoNormal;
	}
	public BigDecimal getAbonoPuntual() {
		return abonoPuntual;
	}
	public void setAbonoPuntual(BigDecimal abonoPuntual) {
		this.abonoPuntual = abonoPuntual;
	}
    
    
	
}
