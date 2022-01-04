package com.indra.formacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.formacion.entity.Persona;
import com.indra.formacion.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository repository;
	
	
	public Persona create(String nombre, String apellido, int edad) {
		
		return repository.save(new Persona(nombre,apellido,edad));
	}
	public Persona getByNombre(String nombre) {
		
		return repository.findByNombre(nombre);
	}
	public Persona update(String nombre, String apellido, int edad) {
		Persona p = repository.findByNombre(nombre);
		p.setApellido(apellido);
		p.setEdad(edad);
		return repository.save(p);
	}
	public void deleteAll() {
		repository.deleteAll();
	}
	public void delete(String nombre) {
		Persona p = repository.findByNombre(nombre);
		repository.delete(p);
	}
	public List<Persona> getAll() {
		
		return repository.findAll();
	}
	public List<Persona> findByNombre(String nombre) {
		
		 List<Persona> lista =  repository.findAll();
		 List<Persona> listaNew = new ArrayList<>();
		 for(Persona p : lista) {
			 
			 if(p.getNombre().equals(nombre)) {
				
				 listaNew.add(p);
			 }
		 }
		 if(listaNew.size()==0) {
			 listaNew = lista;
		
		 }
		 return listaNew;
	}

	
}
