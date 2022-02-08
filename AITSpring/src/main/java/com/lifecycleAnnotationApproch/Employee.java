package com.lifecycleAnnotationApproch;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("1")
	private int eid;
	@Value("Mohit")
	private String ename;
	private Department dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, Department dept) {
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

	public Department getDept() {
		return dept;
	}

	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	@PostConstruct
	public void myinit()
	{
		System.out.println("in init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("in destroy");
	}

}
