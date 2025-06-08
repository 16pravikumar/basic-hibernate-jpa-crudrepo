package com.hibernatejpacrudrepo.demo.service;

import com.hibernatejpacrudrepo.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateUserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public User save(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
        return user;
    }
}
