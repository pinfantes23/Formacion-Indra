package com.indra.formacion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indra.formacion.model.UsuarioRegistro;


public interface UsuarioRepository extends MongoRepository<UsuarioRegistro,Integer>{
	
	public UsuarioRegistro findByLogin(String nombre);
	public UsuarioRegistro findById(String id);
	public List<UsuarioRegistro> findAll();

	
}
