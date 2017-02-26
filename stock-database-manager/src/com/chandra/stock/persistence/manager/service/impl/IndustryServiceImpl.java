package com.chandra.stock.persistence.manager.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.chandra.stock.persistence.manager.core.PersistenceManager;
import com.chandra.stock.persistence.manager.entity.IndustryEO;
import com.chandra.stock.persistence.manager.service.IndustryService;

public class IndustryServiceImpl implements IndustryService {

	@Override
	public List<IndustryEO> getAllIndustries() {
		EntityManager entityManager = new PersistenceManager().getStockPersistenceEntityManager();
		Query q = entityManager.createQuery("select industry from IndustryEO industry");       
		List<IndustryEO> industries =  q.getResultList();
		entityManager.close();
		return industries;
	}

	@Override
	public IndustryEO getIndustryByIndustryId(Integer industryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndustryEO getIndustryByIndustryName(String industryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateIndustry(IndustryEO industry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertCompany(IndustryEO industry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIndustryByIndustryId(Integer industryId) {
		// TODO Auto-generated method stub
		return false;
	}

}
