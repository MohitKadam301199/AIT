package com.ManyToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emp1 {
	
	@Id
	private int eid;
	private String ename;
	
	@ManyToOne
	private Dept1 dept;
	
	public Emp1() {
		// TODO Auto-generated constructor stub
	}

	public Emp1(int eid, String ename, Dept1 dept) {
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

	public Dept1 getDept() {
		return dept;
	}

	public void setDept(Dept1 dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp1 [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	

}
