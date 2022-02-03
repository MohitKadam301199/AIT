package com.ByDirectionMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee2 {
	@Id
	private int eid;
	private String ename;
	
	@ManyToOne
	private Department2 dept;
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}

	public Employee2(int eid, String ename, Department2 dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department2 getDept() {
		return dept;
	}

	public void setDept(Department2 dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	

}
