package com.AIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIT.Dao.StudentDao;
import com.AIT.Model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao sdao;

	@Override
	public void insertStudent(Student s) {
		// TODO Auto-generated method stub
		sdao.save(s);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		sdao.deleteById(id);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		sdao.save(s);
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sdao.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sdao.getById(id);
	}

	@Override
	public List<Student> findByCity(String city) {
		// TODO Auto-generated method stub
		return sdao.findByCity(city);
	}

	@Override
	public List<Student> findByPercentGreaterThan(int percent) {
		// TODO Auto-generated method stub
		return sdao.findByPercentGreaterThan(percent);
	}

	@Override
	public List<Student> findByCityAndPercent(String city, int percent) {
		// TODO Auto-generated method stub
		return sdao.findByCityAndPercent(city, percent);
	}

	@Override
	public List<Student> sortByPercent() {
		// TODO Auto-generated method stub
		return sdao.sortByPercent();
	}
	

}
