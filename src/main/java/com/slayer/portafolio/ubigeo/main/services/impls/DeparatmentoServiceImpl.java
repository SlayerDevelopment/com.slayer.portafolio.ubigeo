package com.slayer.portafolio.ubigeo.main.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slayer.portafolio.ubigeo.main.daos.DepartamentoDao;
import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.services.DepartamentoService;

@Service
public class DeparatmentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDao dao;

	@Override
	public List<Departamento> listar() {
		return dao.findAll();
	}

}
