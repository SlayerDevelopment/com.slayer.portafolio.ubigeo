package com.slayer.portafolio.ubigeo.main.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "distrito", indexes = { @Index(name = "index_valor_distrito", columnList = "valor", unique = true) })
public class Distrito implements Serializable {

	private static final long serialVersionUID = 6452159146881662372L;

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "valor", nullable = false, length = 6, unique = true)
	private String valor;

	@Column(name = "nombre", nullable = false, length = 36)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "provincia_id", nullable = false)
	@JsonIgnore
	private Provincia provinciaId;

	public Distrito() {
	}

	public Distrito(Long id, String valor, String nombre, Provincia provinciaId) {
		this.id = id;
		this.valor = valor;
		this.nombre = nombre;
		this.provinciaId = provinciaId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Provincia getProvinciaId() {
		return provinciaId;
	}

	public void setProvinciaId(Provincia provinciaId) {
		this.provinciaId = provinciaId;
	}

	@Override
	public String toString() {
		return "Distrito [id=" + id + ", valor=" + valor + ", nombre=" + nombre + ", provinciaId=" + provinciaId + "]";
	}
}
