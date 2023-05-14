package com.mx.productos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.productos.request.Producto;
import com.mx.productos.servicios.ProductoServ;



@RestController
@RequestMapping("api/producto")
@CrossOrigin
public class PersonajeWS {

	@Autowired
    ProductoServ ProductoServ;
	//http://localhost:5000/api/producto/listar
	//http://localhost:5000/api/Planeta/listar
	@GetMapping("listar")
	public ResponseEntity<List<Producto>> listar(){
		var lista=ProductoServ.listar();
		return ResponseEntity.ok().body(lista);
	}
	
	@PostMapping("buscar")
	public Producto buscar(@RequestBody Producto producto) {
		producto=ProductoServ.buscar(producto);
		return producto;
	}
	@PostMapping("guardar")
	public ResponseEntity<Producto>guardar(@RequestBody Producto producto) {
		ProductoServ.guardar(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(producto);
	}
	
	@PutMapping("editar")
	public void editar(@RequestBody Producto producto) {
		ProductoServ.editar(producto);
	}
	@DeleteMapping("eliminar")
	public ResponseEntity<Producto> eliminar(@RequestBody Producto producto) {
		return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?>eliminar(@PathVariable Long id){
		ProductoServ.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Producto> ver(@PathVariable Long id) {
		Optional<Producto> o = ProductoServ.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());

	}
	
}