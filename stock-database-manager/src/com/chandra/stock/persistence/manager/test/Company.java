package com.chandra.stock.persistence.manager.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
    private String ticker;
    private String name;
    private String industryId;
    

    public String getTicker() {
		return ticker;
	}


	public void setTicker(String ticker) {
		this.ticker = ticker;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIndustryId() {
		return industryId;
	}


	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}


	public String toString() {
        return "Company [ticker=" + ticker + ", name=" + name + " , industryId="
                + industryId + "]";
    }
}