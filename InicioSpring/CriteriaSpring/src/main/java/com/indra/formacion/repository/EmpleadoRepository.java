package com.indra.formacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.indra.formacion.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>,EmpleadoCustomRepository, JpaSpecificationExecutor<Empleado> {

}
