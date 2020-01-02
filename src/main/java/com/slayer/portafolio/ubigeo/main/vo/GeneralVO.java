package com.slayer.portafolio.ubigeo.main.vo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GeneralVO implements Serializable {

	private static final long serialVersionUID = -6163145723697349427L;
	private String valor;
	private String nombre;
	private List<GeneralVO> vos;

	public GeneralVO() {

	}

	public GeneralVO(String valor, String nombre) {
		this.valor = valor;
		this.nombre = nombre;
	}

	public GeneralVO(String valor, String nombre, Collection<GeneralVO> vos) {
		this.valor = valor;
		this.nombre = nombre;
		this.vos = (List<GeneralVO>) vos;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<GeneralVO> getVos() {
		return vos;
	}

	public void setVos(List<GeneralVO> vos) {
		this.vos = vos;
	}

	@Override
	public String toString() {
		return "GeneralVO [valor=" + valor + ", nombre=" + nombre + ", vos=" + vos + "]";
	}

}
