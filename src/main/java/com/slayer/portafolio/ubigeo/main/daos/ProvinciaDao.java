package com.slayer.portafolio.ubigeo.main.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.slayer.portafolio.ubigeo.main.entities.Provincia;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

public interface ProvinciaDao extends JpaRepository<Provincia, Long>{
	
	@Query("SELECT new com.slayer.portafolio.ubigeo.main.vo.GeneralVO(p.valor, p.nombre) FROM Provincia p WHERE p.departamentoId.valor=:iValor")
	List<GeneralVO> mostrarDepartamentoProvincias(@Param("iValor") String valor);
	
	@Query("SELECT new com.slayer.portafolio.ubigeo.main.vo.GeneralVO(p.valor, p.nombre) FROM Provincia p WHERE p.valor=:iValor")
	Optional<GeneralVO> mostrarDepartamentoProvincia(@Param("iValor") String valor);

}
