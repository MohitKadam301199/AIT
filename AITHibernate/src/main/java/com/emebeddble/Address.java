package com.emebeddble;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String adr1;
	private String city;
	private String landmark;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String adr1, String city, String landmark) {
		super();
		this.adr1 = adr1;
		this.city = city;
		this.landmark = landmark;
	}

	public String getAdr1() {
		return adr1;
	}

	public void setAdr1(String adr1) {
		this.adr1 = adr1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [adr1=" + adr1 + ", city=" + city + ", landmark=" + landmark + "]";
	}
	

}
