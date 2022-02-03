package com.inherit;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class PermanentTeacher extends Teacher1 {
	
	private int salary;
	
	public PermanentTeacher() {
		// TODO Auto-generated constructor stub
	}

	public PermanentTeacher(int tid,String tname,int salary) {
		super(tid,tname);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermanentTeacher [salary=" + salary + "]";
	}
	
	

}
