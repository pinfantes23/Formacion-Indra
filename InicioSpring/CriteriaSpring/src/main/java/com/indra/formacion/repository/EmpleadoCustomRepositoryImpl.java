package com.indra.formacion.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Predicate;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;

import com.indra.formacion.entity.Empleado;
import com.indra.formacion.entity.Empleado_;

public class EmpleadoCustomRepositoryImpl implements EmpleadoCustomRepository {

	@Autowired
    private EntityManager entityManager;
	
	@Override
	public List<Empleado> findByNombreAndDepartmento(String nombre, String departamento) {
		// TODO Auto-generated method stub
		CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery cq=cb.createQuery(Empleado.class);

        Root<Empleado> employee=cq.from(Empleado.class);


        Predicate pr1 =(Predicate) cb.equal(employee.get(Empleado_.NOMBRE),nombre);
        Predicate pr2 =(Predicate) cb.equal(employee.get(Empleado_.DEPARTAMENTO),departamento);
        
        cq.where(pr1,pr2);

        TypedQuery<Empleado> query=entityManager.createQuery(cq);

        return query.getResultList();
	}

	
}
