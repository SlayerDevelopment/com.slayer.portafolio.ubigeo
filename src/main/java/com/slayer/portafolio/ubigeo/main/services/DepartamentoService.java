package com.slayer.portafolio.ubigeo.main.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

public interface DepartamentoService {
	
	List<Departamento> listar();
	List<GeneralVO> listarSoloDepartamentos();
	ResponseEntity<?> mostrarDepartamento(String iValor);

}
