package com.ByDirectionMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department2 {
	@Id
	private int did;
	private String dname;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL)
	private List<Employee2> emplist;
	
	
	public Department2() {
		// TODO Auto-generated constructor stub
	}

	

	public Department2(int did, String dname, List<Employee2> emplist) {
		super();
		this.did = did;
		this.dname = dname;
		this.emplist = emplist;
	}
	



	public Department2(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
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

	
	public List<Employee2> getEmplist() {
		return emplist;
	}



	public void setEmplist(List<Employee2> emplist) {
		this.emplist = emplist;
	}



	@Override
	public String toString() {
		return "Department2 [did=" + did + ", dname=" + dname + ", emplist=" + emplist + "]";
	}



	

}
