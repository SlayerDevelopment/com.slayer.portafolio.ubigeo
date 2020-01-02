package com.slayer.portafolio.ubigeo.main.services.impls;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slayer.portafolio.ubigeo.main.daos.DepartamentoDao;
import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.services.DepartamentoService;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

@Service
public class DeparatmentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> listar() {
		return dao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<GeneralVO> listarSoloDepartamentos() {
		return dao.listarSoloDepartamentos();
	}

	@Override
	@Transactional(readOnly = true)
	public ResponseEntity<?> mostrarDepartamento(String iValor) {
		Map<String, Object> response = new HashMap<String, Object>();
		GeneralVO departamentoVO = dao.mostrarDepartamento(iValor).orElse(null);
		if (departamentoVO == null) {
			response.put("mensaje", "No se encuentra el departamento con valor: " + iValor);
			return new ResponseEntity<Map<String, Object>>(response, NOT_FOUND);
		} else {
			response.put("mensaje", "Se encontro el departamento con valor: " + iValor);
			response.put("departamento", departamentoVO);
			return new ResponseEntity<Map<String, Object>>(response, OK);
		}
	}
}
