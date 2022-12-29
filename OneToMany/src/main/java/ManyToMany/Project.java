package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Project {
	
	@Id
	private int proId;
	private String proName;
	
	@ManyToMany(mappedBy = "project",fetch = FetchType.EAGER)
	private List<Employe> emp;

	public Project(int proId, String proName, List<Employe> emp) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.emp = emp;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public List<Employe> getEmp() {
		return emp;
	}

	public void setEmp(List<Employe> emp) {
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [proId=" + proId + ", proName=" + proName + ", emp=" + emp + "]";
	}
	
	

}
