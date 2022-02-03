package com.oneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Person1 {

	@Id
	private int adharno;
	private String name;
	private long mobile;
    @OneToOne
	private Vehicle1 vehicle;
	
	public Person1() {
		// TODO Auto-generated constructor stub
	}

	public Person1(int adharno, String name, long mobile, Vehicle1 vehicle) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.mobile = mobile;
		this.vehicle = vehicle;
	}

	public int getAdharno() {
		return adharno;
	}

	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Vehicle1 getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle1 vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Person [adharno=" + adharno + ", name=" + name + ", mobile=" + mobile + ", vehicle=" + vehicle + "]";
	}
	

}
