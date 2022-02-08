package com.SterotypeComponentAnnotation;


import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int eid;
	private String ename;
	private Department Dept;
	
	public Employee() {
		System.out.println("In Default Emp constructor :");
	}

	public Employee(int eid, String ename, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		Dept = dept;
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

	public Department getDept() {
		return Dept;
	}

	public void setDept(Department dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Dept=" + Dept + "]";
	}
	

}
