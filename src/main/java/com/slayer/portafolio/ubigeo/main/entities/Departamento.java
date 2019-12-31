package com.slayer.portafolio.ubigeo.main.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamento", indexes = {
		@Index(name = "index_valor_departamento", columnList = "valor", unique = true) })
public class Departamento implements Serializable {

	private static final long serialVersionUID = -3453426102719206649L;

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "valor", nullable = false, length = 2, unique = true)
	private String valor;

	@Column(name = "nombre", nullable = false, length = 13)
	private String nombre;

	@OneToMany(mappedBy = "departamentoId", fetch = FetchType.LAZY)
	private List<Provincia> provincias = new ArrayList<Provincia>();

	public Departamento() {

	}

	public Departamento(Long id, String nombre, String valor, List<Provincia> provincias) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
		this.provincias = provincias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", provincias=" + provincias
				+ "]";
	}

}
