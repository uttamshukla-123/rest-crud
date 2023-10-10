package com.spring.rest.restcrud.dao;

import com.spring.rest.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
