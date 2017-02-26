package com.chandra.stock.persistence.manager.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.chandra.stock.persistence.manager.core.PersistenceManager;
import com.chandra.stock.persistence.manager.entity.CompanyEO;
import com.chandra.stock.persistence.manager.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public List<CompanyEO> getAllCompanies() {
		EntityManager entityManager = new PersistenceManager().getStockPersistenceEntityManager();
		Query query = entityManager.createQuery("select company from CompanyEO company");       
		List<CompanyEO> companies =  query.getResultList();
		entityManager.close();
		return companies;
	}

	@Override
	public List<CompanyEO> getCompanyByIndustryId(Integer industryId) {
		EntityManager entityManager = new PersistenceManager().getStockPersistenceEntityManager();
		String queryString = "select company from CompanyEO company where company.industryEO.industryId=:industryId";
		Query query = entityManager.createQuery(queryString);  
		query.setParameter("industryId", industryId);
		List<CompanyEO> companies = query.getResultList();
		entityManager.close();
		return companies;
	}

	@Override
	public CompanyEO getCompanyByCompanyId(Integer companyId) {
		EntityManager entityManager = new PersistenceManager().getStockPersistenceEntityManager();
		String queryString = "select company from CompanyEO company where company.companyId=:companyId";
		Query query = entityManager.createQuery(queryString);  
		query.setParameter("companyId", companyId);
		CompanyEO company = (CompanyEO)query.getSingleResult();
		entityManager.close();
		return company;
	}

	@Override
	public boolean updateCompany(CompanyEO company) {
		EntityManager entityManager = new PersistenceManager().getStockPersistenceEntityManager();
		entityManager.getTransaction().begin();
		CompanyEO companyEO = entityManager.find(CompanyEO.class, company.getCompanyId());
		companyEO.setEtid(company.getEtid());
		companyEO.setTicker(company.getTicker());
		entityManager.merge(companyEO);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public boolean insertCompany(CompanyEO company) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCompanyByCompanyId(Integer companyId) {
		// TODO Auto-generated method stub
		return false;
	}

}
