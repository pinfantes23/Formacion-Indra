package com.indra.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indra.formacion.entity.Persona;
import com.indra.formacion.service.PersonaService;

@RestController
public class PersonaController {

	
	@Autowired
	private PersonaService service;
	
	//http://localhost:8080/crear?nombre=prueba1&apellido=fernandez&edad=23
	@RequestMapping("/crear")
	public String create(@RequestParam String nombre, @RequestParam String apellido, @RequestParam int edad) {
		Persona p = service.create(nombre, apellido, edad );
		return p.toString();
	}
	
	//http://localhost:8080/get?nombre=prueba1
	@RequestMapping("/get")
	public List<Persona> getPersona(@RequestParam String nombre) {
		
		return service.findByNombre(nombre);
	
	}
	//http://localhost:8080/getAll
	@RequestMapping("/getAll")
	public List<Persona> getPersonas() {	
		return service.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String nombre, @RequestParam String apellido, @RequestParam int edad) {
		Persona p = service.update(nombre, apellido, edad);
		return p.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String nombre) {
		service.delete(nombre);
		return "Se ha eliminado el user: " + nombre;
	}
	@RequestMapping("/deleteAll")
	public String delete() {
		service.deleteAll();
		return "Se han eliminados todos los usuarios";
	}
}
