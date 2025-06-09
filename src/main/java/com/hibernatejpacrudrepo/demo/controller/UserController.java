package com.hibernatejpacrudrepo.demo.controller;

import com.hibernatejpacrudrepo.demo.entity.Employee;
import com.hibernatejpacrudrepo.demo.entity.User;
import com.hibernatejpacrudrepo.demo.service.EmployeeRepositoryService;
import com.hibernatejpacrudrepo.demo.service.HibernateUserService;
import com.hibernatejpacrudrepo.demo.service.JpaEntityManagerService;
import com.hibernatejpacrudrepo.demo.service.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    /*@Autowired
    private HibernateUserService hibernateService;*/

    @Autowired private JpaEntityManagerService jpaService;

    @Autowired private UserRepositoryService repoService;

    @Autowired private EmployeeRepositoryService empRepoService;

    /*@PostMapping("/hibernate")
    public User saveHibernate(@RequestBody User user) {
        return hibernateService.save(user);
    }*/

    @PostMapping("/jpa")
    public User saveJpa(@RequestBody User user) {
        return jpaService.save(user);
    }

    @PostMapping("/repo")
    public User saveRepo(@RequestBody User user) {
        return repoService.save(user);
    }

    @GetMapping("/repo")
    public List<User> getAll() {
        return repoService.findAll();
    }

    @PostMapping("/emp")
    public Employee saveRepo(@RequestBody Employee emp) {
        return empRepoService.save(emp);
    }

    @GetMapping("/emp")
    public List<Employee> getEmp() {
        return empRepoService.findAll();
    }
}