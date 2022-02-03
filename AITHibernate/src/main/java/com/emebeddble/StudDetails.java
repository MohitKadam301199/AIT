package com.emebeddble;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudDetails {
	@Id
	private int sid;
	private String sname;
	private int percent;
	@Embedded
	private Address addr;
	
	public StudDetails() {
		// TODO Auto-generated constructor stub
	}

	public StudDetails(int sid, String sname, int percent, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.addr = addr;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "StudDetails [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", addr=" + addr + "]";
	}
	
	

}
