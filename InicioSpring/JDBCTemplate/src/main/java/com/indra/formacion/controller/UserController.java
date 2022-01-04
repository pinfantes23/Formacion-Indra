package com.indra.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.formacion.repository.UserRepository;

@RestController
public class UserController {

	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public String check() {
		return "check";
	}
	@GetMapping(path="/users")
	public List<String> findAllUser() {
		return repository.getAllUserNames();
	}
	
}
