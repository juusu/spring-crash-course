package eu.nets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import eu.nets.model.Employee;
import eu.nets.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository repo;

    public Iterable<Employee> getEmployees() {
        return repo.findAll(PageRequest.of(0, 100)).getContent();
    }
}
