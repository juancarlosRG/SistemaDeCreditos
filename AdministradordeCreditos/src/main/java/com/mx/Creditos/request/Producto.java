package com.mx.Creditos.request;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTOS_GS")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long skuId;
	@Column
	String nombre;
	@Column
	String descripcion;
	@Column
	BigDecimal precio;

	public Producto() {
	}

	public Producto(Long skuId) {
		this.skuId = skuId;
	}

	public Producto(Long skuId, String nombre, String descripcion, BigDecimal precio) {
		this.skuId = skuId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
