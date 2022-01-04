package com.indra.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.formacion.entity.Empleado;
import com.indra.formacion.repository.EmpleadoRepository;
import com.indra.formacion.repository.EmpleadoSpecificacion;

@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoRepository repository;

	@PostMapping("/empleado")
	public Empleado createEmployee(@RequestBody Empleado employee) {
		return repository.save(employee);
	}

	@GetMapping("/empleados")
	public List<Empleado> findAllEmployees() {
		return repository.findAll();

	}

	@GetMapping("/dep/{departamento}")
	public List<Empleado> findByDepartamentoAndNombre(@PathVariable("departamento") String departamento) {
		
		return repository.findAll(EmpleadoSpecificacion.containsDepartamento(departamento));
	}


	@GetMapping("/emp/{nombre}")
	public List<Empleado> findByNombreAndDepartamento(@PathVariable("nombre") String nombre) {
	
		return repository.findAll(EmpleadoSpecificacion.containsNombre(nombre));
	}
	
	@GetMapping("/emp/{nombre}/{departamento}")
	public List<Empleado> buscarRepository(@PathVariable("nombre") String nombre,@PathVariable("departamento") String departamento) {

		return repository.findByNombreAndDepartmento(nombre,departamento);
	}
}
