package com.slayer.portafolio.ubigeo.main.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slayer.portafolio.ubigeo.main.daos.ProvinciaDao;
import com.slayer.portafolio.ubigeo.main.services.ProvinciaService;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{
	
	@Autowired
	private ProvinciaDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<GeneralVO> mostrarDepartamentoProvincias(String valor) {
		return dao.mostrarDepartamentoProvincias(valor);
	}

}
