package com.OneTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int did;
	private String dname;
	
	@OneToMany
	private List<Employee> emplist;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, List<Employee> emplist) {
		super();
		this.did = did;
		this.dname = dname;
		this.emplist = emplist;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	
	
	

}
