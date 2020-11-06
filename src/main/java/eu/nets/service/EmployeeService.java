package eu.nets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.nets.model.Employee;
import eu.nets.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository repo;

    public List<Employee> getEmployees() {
        return repo.getAllEmployees();
    }
}
