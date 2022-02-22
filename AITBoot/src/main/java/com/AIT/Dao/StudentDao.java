package com.AIT.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AIT.Model.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{

	public List<Student> findByCity(String city);
	
	public List<Student> findByPercentGreaterThan(int percent);
	
	public List<Student> findByCityAndPercent(String city,int percent);
	
	@Query("from Student s order by s.percent desc")
	public List<Student> sortByPercent();
}
