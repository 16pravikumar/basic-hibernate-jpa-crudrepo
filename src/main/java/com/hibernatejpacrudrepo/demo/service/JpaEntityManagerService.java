package com.hibernatejpacrudrepo.demo.service;

import com.hibernatejpacrudrepo.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class JpaEntityManagerService {

    @PersistenceContext private EntityManager em;

    @Transactional
    public User save(User user) {
        em.persist(user);
        return user;
    }
}