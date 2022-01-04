package com.indra.formacion.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Persona {

	@Id
	@GeneratedValue
	private Long id;

	private String nombre;

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

	public Persona(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
}