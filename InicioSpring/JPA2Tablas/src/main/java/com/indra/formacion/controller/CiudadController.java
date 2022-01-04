package com.indra.formacion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.formacion.entity.Ciudad;
import com.indra.formacion.repository.CiudadRepository;

@RestController
public class CiudadController {

	@Autowired
	private CiudadRepository repository;
	
	
	@PostMapping("/addCiudad")
	public Ciudad add(@RequestBody Ciudad c) {
		
		return repository.save(c);
	}
	@GetMapping("/ciudades")
	public List<Ciudad> findAllCiudad() {
		
		return repository.findAll();
	}
	@GetMapping("/ciudad{id}")
	public Optional<Ciudad> findCiudad(@PathVariable int id) {
		
		return repository.findById(id);
	}
	
}
