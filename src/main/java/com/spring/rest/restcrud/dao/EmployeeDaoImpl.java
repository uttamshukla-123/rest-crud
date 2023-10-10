package com.spring.rest.restcrud.dao;

import com.spring.rest.restcrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements  EmployeeDao{

    //define field for entity manager
    private final EntityManager entityManager;

    //setup constructor for entity manager

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //create a query
        TypedQuery<Employee> typedQuery=entityManager.createQuery("From Employee",Employee.class);

        //execute query and get result list
        return typedQuery.getResultList();
    }
}
