package com.CollectionList;

import java.util.List;

public class Employee {
	
	private int eid;
	private String ename;
	
	private List<Department>li;
	
	public Employee() {}

	public Employee(int eid, String ename, List<Department> li) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.li = li;
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

	public List<Department> getLi() {
		return li;
	}

	public void setLi(List<Department> li) {
		this.li = li;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", li=" + li + "]";
	}
	
	
	

}
