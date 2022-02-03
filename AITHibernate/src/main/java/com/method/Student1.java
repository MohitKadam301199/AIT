package com.method;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="stud")
public class Student1 {
    
	@Id
	private int sid;
	@Column(name="StudName",nullable = false)
	private String sname;
	@Column(name="Percentage",nullable = true)
	private int percent;
	
	@Transient
	private int spass;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	

	public Student1(int sid, String sname, int percent, int spass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
		this.spass = spass;
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

	public int getSpass() {
		return spass;
	}

	public void setSpass(int spass) {
		this.spass = spass;
	}



	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", spass=" + spass + "]";
	}



	
	

}
