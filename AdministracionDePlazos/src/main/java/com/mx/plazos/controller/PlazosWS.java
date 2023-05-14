package com.mx.plazos.controller;

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

import com.mx.plazos.dominio.Plazos;
import com.mx.plazos.servicios.PlazosServ;

@RestController
@RequestMapping("api/plazos")
@CrossOrigin
public class PlazosWS {
	@Autowired
	PlazosServ plazosServ;

	@GetMapping("listar")
	public ResponseEntity<List<Plazos>> listar() {
		var lista = plazosServ.listar();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("buscar")
	public Plazos buscar(@RequestBody Plazos producto) {
		producto = plazosServ.buscar(producto);
		return producto;
	}

	@PostMapping("guardar")
	public ResponseEntity<Plazos> guardar(@RequestBody Plazos producto) {
		plazosServ.guardar(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(producto);
	}

	@PutMapping("editar")
	public void editar(@RequestBody Plazos producto) {
		plazosServ.editar(producto);
	}

	@DeleteMapping("eliminar")
	public ResponseEntity<Plazos> eliminar(@RequestBody Plazos producto) {
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id) {
		plazosServ.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Plazos> ver(@PathVariable Long id) {
		Optional<Plazos> o = plazosServ.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());

	}
}
