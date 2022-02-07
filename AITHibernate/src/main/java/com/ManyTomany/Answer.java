package com.ManyTomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;    
	private String answername;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(int id, String answername) {
		super();
		this.id = id;
		this.answername = answername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answername=" + answername + "]";
	}
	
	

}
