package com.autowiredAnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	//@Value("1")
	private int sid;
	//@Value("Mohit")
	private String sname;
	
	private Course course;
	private Trainer trainer;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired
	public Student(int sid, String sname, Course course, Trainer trainer) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.trainer = trainer;
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

	public Course getCourse() {
		return course;
	}

	//@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	//@Autowired
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", trainer=" + trainer + "]";
	}
	
	

}
