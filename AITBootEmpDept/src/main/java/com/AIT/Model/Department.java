package com.AIT.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private int depid;
	private String departmentName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String departmentName) {
		super();
		this.depid = depid;
		departmentName = departmentName;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", DepartmentName=" + departmentName + "]";
	}
	
	

}
