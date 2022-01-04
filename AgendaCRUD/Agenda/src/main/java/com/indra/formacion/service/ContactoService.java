package com.indra.formacion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.formacion.model.Contacto;
import com.indra.formacion.repository.ContactoRepository;

@Service
public class ContactoService {

	@Autowired
	private ContactoRepository repository;

	public Contacto create(String nombre, String apellido, int numeroTelefono) {

		return repository.save(new Contacto(nombre, apellido, numeroTelefono));
	}

	public Contacto getById(String id) {

		return repository.findById(id);
	}

	public Contacto update(String id,String nombre,String apellido,int numeroTelefono) {
		Contacto c = repository.findById(id);
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setNumeroTelefono(numeroTelefono);
		return repository.save(c);
	}

	public void deleteAll() {
		repository.deleteAll();
	}

	public void delete(String id) {
		Contacto c = repository.findById(id);
		repository.delete(c);
	}

	public List<Contacto> getAll() {

		return repository.findAll();
	}

	public List<Contacto> findByNombre(String nombre) {

		List<Contacto> lista = repository.findAll();
		List<Contacto> listaNew = new ArrayList<>();
		for (Contacto p : lista) {

			if (p.getNombre().equals(nombre)) {

				listaNew.add(p);
			}
		}
		if (listaNew.size() == 0) {
			listaNew = lista;

		}
		return listaNew;
	}
}
