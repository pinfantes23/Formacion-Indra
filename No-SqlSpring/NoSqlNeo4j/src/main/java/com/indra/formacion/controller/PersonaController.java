package com.indra.formacion.controller;

import java.util.Collection;
import java.util.List;

import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.neo4j.driver.Session;
import org.springframework.http.MediaType;

//Diferencia entre Controller usa un motor de plantillado Rest devuelve JSON 
@RestController
public class PersonaController {


	private final Driver driver; 

	public PersonaController(Driver driver) { 
		this.driver = driver;
	}
	//http://localhost:8081/personas
	@GetMapping(path = "/personas", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<String> getPersonaTitles() {

		try (Session session = driver.session()) { 
			
			return session.run("MATCH (m:Persona) RETURN m ORDER BY m.nombre ASC")
				.list(r -> r.get("m").asNode().get("nombre").asString());
		}
	}

}