package com.indra.formacion.repository;

import java.util.List;

import com.indra.formacion.entity.Empleado;

public interface EmpleadoCustomRepository {

    List<Empleado> findByNombreAndDepartmento(String nombre,String departamento);
    
}