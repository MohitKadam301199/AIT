package com.oneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle1 {
	
	@Id
	private int vid;
	private String vname;
	@OneToOne
	private Person1 person;
	
	public Vehicle1() {
		// TODO Auto-generated constructor stub
	}
	

	public Vehicle1(int vid, String vname, Person1 person) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.person = person;
	}


	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}
	

	public Person1 getPerson() {
		return person;
	}


	public void setPerson(Person1 person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "Vehicle1 [vid=" + vid + ", vname=" + vname + ", person=" + person + "]";
	}


	
	

}
