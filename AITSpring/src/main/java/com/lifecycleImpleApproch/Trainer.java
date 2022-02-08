package com.lifecycleImpleApproch;

public class Trainer {

	private String tname;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(String tname) {
		super();
		this.tname = tname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Trainer [tname=" + tname + "]";
	}
	
}
