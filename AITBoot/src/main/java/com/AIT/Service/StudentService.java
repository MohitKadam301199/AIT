package com.AIT.Service;

import java.util.List;

import com.AIT.Model.Student;

public interface StudentService {

	
	void insertStudent(Student s);
	
	void deleteStudent(int id);
	
	void updateStudent(Student s);
	
	List<Student> getAllStudent();
	
	Student getStudentById(int id);
	
    public List<Student> findByCity(String city);
	
	public List<Student> findByPercentGreaterThan(int percent);
	
	public List<Student> findByCityAndPercent(String city,int percent);
	
	public List<Student> sortByPercent();
}

