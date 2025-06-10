package com.hibernatejpacrudrepo.demo.config;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
   /* @Bean
    public SessionFactory sessionFactory(EntityManagerFactory emf) {
        return emf.unwrap(SessionFactory.class);
    }*/
   @Autowired
   private EntityManagerFactory entityManagerFactory;

    public SessionFactory getSessionFactory(){
        return this.entityManagerFactory.unwrap(SessionFactory.class);
    }
}
