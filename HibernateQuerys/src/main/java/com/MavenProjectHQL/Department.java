package com.MavenProjectHQL;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {
	
	@Id
	private int dId;
	private String dName;
	private int dSalary;
	
	@ManyToMany(mappedBy = "dep",fetch = FetchType.EAGER)
	private List<Employe> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dId, String dName, int dSalary, List<Employe> emp) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dSalary = dSalary;
		this.emp = emp;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdSalary() {
		return dSalary;
	}

	public void setdSalary(int dSalary) {
		this.dSalary = dSalary;
	}

	public List<Employe> getEmp() {
		return emp;
	}

	public void setEmp(List<Employe> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dSalary=" + dSalary + ", emp=" + emp + "]";
	}

	

}
