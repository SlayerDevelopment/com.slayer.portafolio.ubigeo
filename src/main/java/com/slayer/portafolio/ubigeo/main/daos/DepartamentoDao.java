package com.slayer.portafolio.ubigeo.main.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.slayer.portafolio.ubigeo.main.entities.Departamento;
import com.slayer.portafolio.ubigeo.main.vo.GeneralVO;

public interface DepartamentoDao extends JpaRepository<Departamento, Long> {

	@Query("SELECT new com.slayer.portafolio.ubigeo.main.vo.GeneralVO(d.valor, d.nombre) FROM Departamento d")
	List<GeneralVO> listarSoloDepartamentos();

	@Query("SELECT new com.slayer.portafolio.ubigeo.main.vo.GeneralVO(d.valor, d.nombre) FROM Departamento d WHERE d.valor=:iValor")
	Optional<GeneralVO> mostrarDepartamento(@Param("iValor") String iValor);
	
}
