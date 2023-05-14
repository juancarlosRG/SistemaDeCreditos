package com.mx.productos.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.productos.request.Producto;

public interface ProductoDao extends CrudRepository<Producto,Long>{

}
