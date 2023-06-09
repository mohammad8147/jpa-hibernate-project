package com.jpahibernate.controller;

import com.jpahibernate.model.Employee;
import com.jpahibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:59165")
@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return  employeeRepository.findAll();
    }
}
