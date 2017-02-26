package com.chandra.stock.persistence.manager.service;


import java.util.List;

import com.chandra.stock.persistence.manager.entity.IndustryEO;

public interface IndustryService {
	public List<IndustryEO> getAllIndustries();
	public IndustryEO getIndustryByIndustryId(Integer industryId);
	public IndustryEO getIndustryByIndustryName(String industryName);
	public boolean updateIndustry(IndustryEO industry);
	public boolean insertCompany(IndustryEO industry);
	public boolean deleteIndustryByIndustryId(Integer industryId);

}
