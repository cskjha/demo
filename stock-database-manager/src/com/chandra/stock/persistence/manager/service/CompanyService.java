package com.chandra.stock.persistence.manager.service;

import java.util.List;

import com.chandra.stock.persistence.manager.entity.CompanyEO;

public interface CompanyService {
	public List<CompanyEO> getAllCompanies();
	public List<CompanyEO> getCompanyByIndustryId(Integer industryId);
	public CompanyEO getCompanyByCompanyId(Integer companyId);
	public boolean updateCompany(CompanyEO company);
	public boolean insertCompany(CompanyEO company);
	public boolean deleteCompanyByCompanyId(Integer companyId);

}
