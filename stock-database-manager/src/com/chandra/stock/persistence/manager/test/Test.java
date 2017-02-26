package com.chandra.stock.persistence.manager.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.chandra.stock.persistence.manager.entity.CompanyEO;

public class Test {
    private static final String PERSISTENCE_UNIT_NAME = "stock-persistence";
      private static EntityManagerFactory factory;
      public static void main(String[] args) {
    	  System.out.println(System.currentTimeMillis());
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
     
        Query q = em.createQuery("select i from CompanyEO i");
        List<CompanyEO> companyList = q.getResultList();
        for (CompanyEO company : companyList) {
          System.out.println(company);
        }
//        em.getTransaction().begin();
//        Company company = new Company();
//        company.setTicker("SBIN");
//        company.setName("State Bank of India");
//        company.setIndustryId("Banking");
//        em.persist(company);
//        em.getTransaction().commit();
        em.close();
      }
    }