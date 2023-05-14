package com.mx.productos.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.productos.dao.ProductoDao;
import com.mx.productos.request.Producto;

@Service
public class ProductoServImp implements ProductoServ{
 
	@Autowired
	ProductoDao productosDao;
	@Override
	public void guardar(Producto productos) {
		// TODO Auto-generated method stub
		productosDao.save(productos);
	}

	@Override
	public void editar(Producto productos) {
		// TODO Auto-generated method stub
		productosDao.save(productos);
	}

	@Override
	public void eliminar(Producto productos) {
		// TODO Auto-generated method stub
		productosDao.delete(productos);
	}

	@Override
	public Producto buscar(Producto producto) {
		// TODO Auto-generated method stub
		return productosDao.findById(producto.getSkuId()).orElse(null);
	}
	

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>) productosDao.findAll();
	}

	@Override
	public void deleteById(Long id) {
		
		productosDao.deleteById(id);
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return productosDao.findById(id);
	}

}
