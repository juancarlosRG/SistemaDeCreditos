package com.mx.plazos.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.plazos.dao.PlazosDao;
import com.mx.plazos.dominio.Plazos;

@Service
public class PlazosServImp implements PlazosServ {

	@Autowired
	PlazosDao plazosDao;

	@Override
	public void guardar(Plazos plazos) {
		// TODO Auto-generated method stub
		plazosDao.save(plazos);
	}

	@Override
	public void editar(Plazos plazos) {
		// TODO Auto-generated method stub
		plazosDao.save(plazos);
	}

	@Override
	public void eliminar(Plazos plazos) {
		// TODO Auto-generated method stub
		plazosDao.delete(plazos);
	}

	@Override
	public Plazos buscar(Plazos plazos) {
		// TODO Auto-generated method stub
		return plazosDao.findById(plazos.getId()).orElse(null);
	}

	@Override
	public List<Plazos> listar() {
		// TODO Auto-generated method stub
		return (List<Plazos>) plazosDao.findAll();
	}

	@Override
	public void deleteById(Long id) {

		plazosDao.deleteById(id);
	}

	@Override
	public Optional<Plazos> findById(Long id) {
		return plazosDao.findById(id);
	}

}
