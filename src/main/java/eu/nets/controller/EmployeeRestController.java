package eu.nets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.nets.model.Employee;
import eu.nets.service.EmployeeService;

@RestController
public class EmployeeRestController {
    
    @Autowired
    EmployeeService service;
    
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return service.getEmployees();
    }
}