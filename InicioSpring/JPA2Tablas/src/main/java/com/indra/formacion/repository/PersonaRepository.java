package com.indra.formacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.formacion.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Integer>{

}
