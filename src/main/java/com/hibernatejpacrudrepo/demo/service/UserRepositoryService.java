package com.hibernatejpacrudrepo.demo.service;

import com.hibernatejpacrudrepo.demo.entity.User;
import com.hibernatejpacrudrepo.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryService {
    @Autowired
    private UserRepository repo;

    public User save(User user) {
        return repo.save(user);
    }

    public List<User> findAll() {
        return (List<User>) repo.findAll();
    }
}