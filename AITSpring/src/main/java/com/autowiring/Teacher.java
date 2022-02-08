package com.autowiring;

public class Teacher {
	
	private int tid;
	private String tname;
	
	private Subject subject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, Subject subject) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", subject=" + subject + "]";
	}
	

}
