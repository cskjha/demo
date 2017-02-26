package com.chandra.stock.persistence.manager.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {
    private static final String PERSISTENCE_UNIT_NAME = "stock-persistence";
      private static EntityManagerFactory factory;
      public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
     
        Query q = em.createQuery("select c from Company c");
        List<Company> companyList = q.getResultList();
        for (Company company : companyList) {
          System.out.println(company);
        }
        em.getTransaction().begin();
        Company company = new Company();
        company.setTicker("SBIN");
        company.setName("State Bank of India");
        company.setIndustryId("Banking");
        em.persist(company);
        em.getTransaction().commit();
        em.close();
      }
    }