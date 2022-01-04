package com.indra.formacion.models;

import java.io.Serializable;


public class Persona implements Serializable {
 
    private static final long serialVersionUID = 1L; 
	
	private String id;
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona( String nombre, String apellido,int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public Persona( ) {
		super();
		this.id = null;
		this.nombre = null;
		this.apellido = null;
		this.edad = 0;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
}
