package com.ManyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;    
	private String qname;   
	
	@ManyToMany
	private List<Answer> answers;  
	

	public Question() {
		// TODO Auto-generated constructor stub
	}


	public Question(int id, String qname, List<Answer> answers) {
		super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQname() {
		return qname;
	}


	public void setQname(String qname) {
		this.qname = qname;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answers=" + answers + "]";
	}
	
	

}
