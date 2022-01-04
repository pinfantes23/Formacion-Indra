package com.indra.formacion.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UsuarioRegistro {
	
	@Id
	private String id;
	private String role;
	private String login;
	private String pass;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UsuarioRegistro(String login, String pass,String role) {
		super();
		this.login = login;
		this.pass = pass;
		this.role = role;
	
	}
	@Override
	public String toString() {
		return "UsuarioRegistro [id=" + id + ", login=" + login + ", pass=" + pass + ", role=" + role + "]";
	}
	
	
}
