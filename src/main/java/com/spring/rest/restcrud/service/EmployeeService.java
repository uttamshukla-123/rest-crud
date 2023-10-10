package com.spring.rest.restcrud.service;

import com.spring.rest.restcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
