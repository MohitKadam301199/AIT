package com.ManyToone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept1 {

	@Id
	private int did;
	private String dname;
	
	public Dept1() {
		// TODO Auto-generated constructor stub
	}

	public Dept1(int did, String dname) {
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

	@Override
	public String toString() {
		return "Dept1 [did=" + did + ", dname=" + dname + "]";
	}
	
}
