package com.indra.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.formacion.model.UsuarioRegistro;
import com.indra.formacion.repository.ContactoRepository;
import com.indra.formacion.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	@Autowired
	private UsuarioRepository repository;

	public UsuarioRegistro create(String login, String pass, String role) {

		return repository.save(new UsuarioRegistro(login,pass,role));
	}
	
	public List<UsuarioRegistro> findAll(){
		
		return repository.findAll();
	}


}
