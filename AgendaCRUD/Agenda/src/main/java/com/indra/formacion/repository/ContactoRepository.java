package com.indra.formacion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indra.formacion.model.Contacto;

@Repository
public interface ContactoRepository extends MongoRepository<Contacto,Integer>{
	
	public Contacto findByNombre(String nombre);
	
	public Contacto findByNumeroTelefono(int numeroTelefono);
	
	public Contacto findById(String id);

	public List<Contacto> findAll();
	
	
	
}

