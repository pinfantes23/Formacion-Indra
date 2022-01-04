package com.indra.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.formacion.entity.Persona;
import com.indra.formacion.repository.PersonaRepository;

@RestController
public class PersonaController {

	
	@Autowired
	private PersonaRepository repository;
	
	
	@PostMapping("/addPersona")
	public Persona add(@RequestBody Persona p) {
		
		return repository.save(p);
	}
	@GetMapping("/personas")
	public List<Persona> findAllPersonas() {
		return repository.findAll();
	}
	
}
