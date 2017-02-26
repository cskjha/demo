package com.chandra.stock.persistence.manager.test;

import com.chandra.stock.persistence.manager.entity.CompanyEO;
import com.chandra.stock.persistence.manager.service.impl.CompanyServiceImpl;
import com.chandra.stocks.common.utils.http.DatabaseUtil;

public class Test {
      public static void main(String[] args) {
//    	List<IndustryEO> industries = new IndustryServiceImpl().getAllIndustries();
//    	for(IndustryEO industry : industries) {
//    		List<CompanyEO> companies = new CompanyServiceImpl().getCompanyByIndustryId(industry.getIndustryId());
//    		System.out.println(companies.size());
//    	}
    	  CompanyEO company = new CompanyServiceImpl().getCompanyByCompanyId(0);
    	  company.setTicker("WENDT");
    	  company.setEtid("12544");
    	  company.setModifiedOn(DatabaseUtil.getModifiedOnTime());
    	  new CompanyServiceImpl().updateCompany(company);
    	  
      }
    }