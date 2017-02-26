package com.chandra.stock.persistence.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="master_company")
public class CompanyEO {
	@Id
	private Integer companyId;
	private String companyName;
	private long modifiedOn;
	
	@ManyToOne
	@JoinColumn(name="IndustryId")
	private IndustryEO industryEO;
	
	@Column(name="CompanyId")
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	@Column(name="CompanyName")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name="ModifiedOn")
	public long getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public IndustryEO getIndustryEO() {
		return industryEO;
	}
	public void setIndustryEO(IndustryEO industryEO) {
		this.industryEO = industryEO;
	}
}
