package com.AIT;

public class Student {
	
	private int sid;
	private String sname;
	private int percentage;
	
	private Course course;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, int percentage, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percentage = percentage;
		this.course = course;
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

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percentage=" + percentage + ", course=" + course + "]";
	}
	
	
	
}