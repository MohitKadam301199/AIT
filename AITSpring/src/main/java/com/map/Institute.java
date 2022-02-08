package com.map;

import java.util.Map;

public class Institute {
	
	private int insid;
	private String insname;
	
	private Map<Student,Trainer>mp;
	
	public Institute() {}

	public Institute(int insid, String insname, Map<Student, Trainer> mp) {
		super();
		this.insid = insid;
		this.insname = insname;
		this.mp = mp;
	}

	public int getInsid() {
		return insid;
	}

	public void setInsid(int insid) {
		this.insid = insid;
	}

	public String getInsname() {
		return insname;
	}

	public void setInsname(String insname) {
		this.insname = insname;
	}

	public Map<Student, Trainer> getMp() {
		return mp;
	}

	public void setMp(Map<Student, Trainer> mp) {
		this.mp = mp;
	}


	public String toString() {
		return "Institute [insid=" + insid + ", insname=" + insname + ", mp=" + mp + "]";
	}
	
	


}
