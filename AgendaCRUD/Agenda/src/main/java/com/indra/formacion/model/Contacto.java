package com.indra.formacion.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contacto {

	@Id
	private String id;
	private String nombre;
	private String apellido;
	private int numeroTelefono;
	
	
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
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Contacto( String nombre, String apellido, int numeroTelefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTelefono = numeroTelefono;
	}
	public Contacto() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + numeroTelefono + "]";
	}
	
	
	
}
