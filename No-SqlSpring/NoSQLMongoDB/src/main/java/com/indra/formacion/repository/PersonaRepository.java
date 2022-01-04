package com.indra.formacion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indra.formacion.entity.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,Integer>{
	
	public Persona findByNombre(String nombre);
	
	public List<Persona> findByEdad(int edad);

	public List<Persona> findAll();
}
