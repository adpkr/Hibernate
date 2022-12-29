package com.MavenProjectHQL;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employe {
	
	@Id
	private int eId;
	private String eName;
	private String eAdd;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Department> dep;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int eId, String eName, String eAdd, List<Department> dep) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAdd = eAdd;
		this.dep = dep;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public List<Department> getDep() {
		return dep;
	}

	public void setDep(List<Department> dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employe [eId=" + eId + ", eName=" + eName + ", eAdd=" + eAdd + ", dep=" + dep + "]";
	}

    

	

}
