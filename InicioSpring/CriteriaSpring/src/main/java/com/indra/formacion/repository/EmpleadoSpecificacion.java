package com.indra.formacion.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.indra.formacion.entity.Empleado;
import com.indra.formacion.entity.Empleado_;

@Component
public class EmpleadoSpecificacion {
	
	public static Specification<Empleado> containsNombre(String nombre) {
		return ((root, criteriaQuery, criteriaBuilder) -> {
			return criteriaBuilder.like(root.get(Empleado_.NOMBRE), "%" + nombre + "%");
		});
	}
	public static Specification<Empleado> containsDepartamento(String departamento) {
		return ((root, criteriaQuery, criteriaBuilder) -> {
			return criteriaBuilder.like(root.get(Empleado_.DEPARTAMENTO), "%" + departamento + "%");
		});
	}

}
