package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Instrumento {

	private @Id @GeneratedValue Long id;
	private String nombre;
	private String codigo;
	private String descripcion;

	public Instrumento() {
	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Instrumento instrumento = (Instrumento) o;
		return Objects.equals(id, instrumento.id) &&
			Objects.equals(nombre, instrumento.nombre) &&
			Objects.equals(codigo, instrumento.codigo) &&
			Objects.equals(descripcion, instrumento.descripcion);
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


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Instrumento(Long id, String nombre, String codigo, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	
}