package com.hibernatejpacrudrepo.demo.repository;

import com.hibernatejpacrudrepo.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);
}
