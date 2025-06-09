package com.hibernatejpacrudrepo.demo.service;

import com.hibernatejpacrudrepo.demo.entity.Employee;
import com.hibernatejpacrudrepo.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRepositoryService {
    @Autowired
    private EmployeeRepository empRepo;

    public Employee save(Employee emp) {
        return empRepo.save(emp);
    }

    public List<Employee> findAll() {
        return (List<Employee>) empRepo.findAll();
    }
}