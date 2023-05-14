package com.mx.plazos.servicios;

import java.util.List;
import java.util.Optional;

import com.mx.plazos.dominio.Plazos;

public interface PlazosServ {
	public void guardar(Plazos plazos);

	public void editar(Plazos plazos);

	public void eliminar(Plazos plazos);

	public Plazos buscar(Plazos plazos);

	public List<Plazos> listar();

	public void deleteById(Long id);

	public Optional<Plazos> findById(Long id);
}
