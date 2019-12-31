package com.slayer.portafolio.ubigeo.main.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.services.DepartamentoService;

@RestController
@RequestMapping("/")
public class UbigeoRestController {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping
	public List<Departamento> home(){
		return departamentoService.listar();
	}

}
