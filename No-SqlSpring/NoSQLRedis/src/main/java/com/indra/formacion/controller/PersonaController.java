package com.indra.formacion.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.indra.formacion.models.Persona;
import com.indra.formacion.repository.PersonaRepository;



//Diferencia entre Controller usa un motor de plantillado Rest devuelve JSON 
@RestController
@CrossOrigin
@RequestMapping("/persona")
public class PersonaController {
 
    @Autowired
    private PersonaRepository repository;
 
    //http://localhost:8080/persona/save?nombre=piti&apellido=piti&edad=22
	@RequestMapping("/save")
	public String save(@RequestParam String nombre, @RequestParam String apellido,@RequestParam int edad) {
		Persona p = new Persona(nombre, apellido,edad );
		p.setId(UUID.randomUUID().toString());
		repository.save(p);
		return p.toString();
	}
	//http://localhost:8080/persona
    @GetMapping
    public List list(){
        return repository.findAll();
    }
    //http://localhost:8080/persona/d8dcebf5-83e8-471a-8ca1-1cce32d3c55c
    @GetMapping("/{id}")
    public Persona get(@PathVariable String id){
    	
        return repository.findById(id);
    }
 
    @PutMapping
    public Persona update(@RequestBody Persona p){
    	repository.update(p);
        return p;
    }
    //http://localhost:8080/persona/1
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
    	repository.delete(id);
        return id;
    }
    

}