package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employe {
	
	@Id
	private int empId;
	private String empName;
	
	@ManyToMany
	@JoinTable(joinColumns = {@JoinColumn (name = "Emp_Id")}, inverseJoinColumns = {@JoinColumn(name = "Pro_Id")})
	private List<Project> project;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int empId, String empName, List<Project> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", project=" + project + "]";
	}
	
	
	

}
