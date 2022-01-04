package com.indra.formacion.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.indra.formacion.model.Contacto;
import com.indra.formacion.service.ContactoService;

@RestController
public class ContactoController {

	@Autowired
	private ContactoService service;

	@GetMapping("/")
	public ModelAndView welcomePage() {

		return new ModelAndView("index");
	}
	@GetMapping("/list")
	public ModelAndView contactoLista() {

		ModelAndView model = new ModelAndView();
		List<Contacto> lista = service.getAll();
		model.addObject("lista", lista);
		model.setViewName("listaContactos");
		return model;
	}
	@GetMapping("/addContacto")
	public ModelAndView addContacto() {

		Contacto c = new Contacto();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("nuevoContacto", c);
		modelAndView.setViewName("agregarContacto");

		return modelAndView;
	}

	@GetMapping("/deleteContacto")
	public ModelAndView deleteContacto() {

		ModelAndView modelAndView = new ModelAndView();
		List<Contacto> lista = service.getAll();
		modelAndView.addObject("lista", lista);
		modelAndView.setViewName("eliminarContacto");

		return modelAndView;
	}

	//Delete List
	@GetMapping("/eliminoContacto/{id}")
	public ModelAndView deleteContacto(@PathVariable("id") String id) {
		service.delete(id);
		return new ModelAndView("redirect:/list");
	}

	//add Contact
	@PostMapping("/guardaContacto")
	public ModelAndView addContacto(@ModelAttribute("contactoAgregado") Contacto c) {

		service.create(c.getNombre(), c.getApellido(), c.getNumeroTelefono());
		return new ModelAndView("redirect:/");
	}
	
	@GetMapping("/updateContacto")
	public ModelAndView updateContacto() {

		ModelAndView modelAndView = new ModelAndView();
		List<Contacto> lista = service.getAll();
		modelAndView.addObject("lista", lista);
		modelAndView.setViewName("modificarContacto");

		return modelAndView;
	}
	
	@GetMapping("/idContacto/{id}")
	public ModelAndView idContacto(@PathVariable("id") String id) {
		ModelAndView m = new ModelAndView();
		m.addObject("modificoContacto", service.getById(id));
		m.setViewName("hagoUpdate");
		return m;
	}
	@PostMapping("/guardaUpdateContacto")
	public ModelAndView guardaUpdateContacto(@ModelAttribute("updateContacto") Contacto c) {

		service.update(c.getId(),c.getNombre(), c.getApellido(), c.getNumeroTelefono());
		return new ModelAndView("redirect:/");
	}

}
