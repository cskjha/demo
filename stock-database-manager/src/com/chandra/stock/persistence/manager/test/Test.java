package com.chandra.stock.persistence.manager.test;

import java.util.List;

import com.chandra.stock.persistence.manager.entity.CompanyEO;
import com.chandra.stock.persistence.manager.entity.IndustryEO;
import com.chandra.stock.persistence.manager.service.impl.CompanyServiceImpl;
import com.chandra.stock.persistence.manager.service.impl.IndustryServiceImpl;

public class Test {
      public static void main(String[] args) {
    	List<IndustryEO> industries = new IndustryServiceImpl().getAllIndustries();
    	for(IndustryEO industry : industries) {
    		List<CompanyEO> companies = new CompanyServiceImpl().getCompanyByIndustryId(industry.getIndustryId());
    		System.out.println(companies.size());
    	}
       
//        em.getTransaction().begin();
//        Company company = new Company();
//        company.setTicker("SBIN");
//        company.setName("State Bank of India");
//        company.setIndustryId("Banking");
//        em.persist(company);
//        em.getTransaction().commit();
      }
    }