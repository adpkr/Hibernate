package com.HibernateApp2;

import javax.persistence.Embeddable;

@Embeddable
public class Company {
	
	private String CompanyName;
	private String CompanyAddress;
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Company(String companyName, String companyAddress) {
		super();
		CompanyName = companyName;
		CompanyAddress = companyAddress;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String getCompanyAddress() {
		return CompanyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}


	@Override
	public String toString() {
		return "Company [CompanyName=" + CompanyName + ", CompanyAddress=" + CompanyAddress + "]";
	}
	
	

}
