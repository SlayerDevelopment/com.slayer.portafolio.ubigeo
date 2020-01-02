package com.slayer.portafolio.ubigeo.main.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.services.DepartamentoService;
import com.slayer.portafolio.ubigeo.main.services.ProvinciaService;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

@RestController
@RequestMapping
public class UbigeoRestController {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private ProvinciaService provinciaService;
	
	@GetMapping
	public List<Departamento> listarTodo(){
		return departamentoService.listar();
	}
	
	@GetMapping("/departamentos")
	public List<GeneralVO> listarSoloDepartamentos(){
		return departamentoService.listarSoloDepartamentos();
	}
	
	@GetMapping("/departamento/{valor}")
	public ResponseEntity<?> mostrarDepartamento(@PathVariable("valor") String valor) {
		return departamentoService.mostrarDepartamento(valor);
	}
	
	@GetMapping("/departamento/{valor}/provincias")
	public List<?> mostrarDepartamentoProvincias(@PathVariable("valor") String valor) {
		return provinciaService.mostrarDepartamentoProvincias(valor);
	}

}
