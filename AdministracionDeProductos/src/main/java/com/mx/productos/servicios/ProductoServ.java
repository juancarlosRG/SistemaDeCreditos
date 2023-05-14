package com.mx.productos.servicios;

import java.util.List;
import java.util.Optional;

import com.mx.productos.request.Producto;

public interface ProductoServ {
	public void guardar(Producto producto);
	public void editar(Producto producto);
	public void eliminar(Producto producto);
	public Producto buscar(Producto producto);
	public List<Producto>listar();
	public void deleteById(Long id);
	public Optional<Producto> findById(Long id);

}
