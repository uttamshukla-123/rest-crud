package com.spring.rest.restcrud.controller;

import com.spring.rest.restcrud.dao.EmployeeDao;
import com.spring.rest.restcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    //quick and dirty inject employee dao
    private EmployeeDao employeeDao;

    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    //expose /employees and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
    return  employeeDao.findAll();
    }
}
