package com.mx.plazos.dominio;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "PLAZO_GS")
public class Plazos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer semanas;
    @Column
    private BigDecimal tasaNormal;
    @Column
    private BigDecimal tasaPuntual;
	public Plazos() {
	}
	public Plazos(Long id, Integer semanas, BigDecimal tasaNormal, BigDecimal tasaPuntual) {
		this.id = id;
		this.semanas = semanas;
		this.tasaNormal = tasaNormal;
		this.tasaPuntual = tasaPuntual;
	}
	public Plazos(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSemanas() {
		return semanas;
	}
	public void setSemanas(Integer semanas) {
		this.semanas = semanas;
	}
	public BigDecimal getTasaNormal() {
		return tasaNormal;
	}
	public void setTasaNormal(BigDecimal tasaNormal) {
		this.tasaNormal = tasaNormal;
	}
	public BigDecimal getTasaPuntual() {
		return tasaPuntual;
	}
	public void setTasaPuntual(BigDecimal tasaPuntual) {
		this.tasaPuntual = tasaPuntual;
	}
    
    
}