package com.CollectionListMapped;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Question1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;    
	private String qname;   
	
	@ManyToMany
	private List<Answer1> answers;  

	
	public Question1() {
		// TODO Auto-generated constructor stub
	}


	public Question1(int id, String qname, List<Answer1> answers) {
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


	public List<Answer1> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}


	@Override
	public String toString() {
		return "Question1 [id=" + id + ", qname=" + qname + ", answers=" + answers + "]";
	}
	
	
}