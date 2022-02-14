package com.ait.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ait.Model.Student;
import com.ait.service.StudentService;

@Controller
public class StudentController {
	
	
//	@ResponseBody
//	@GetMapping(value="/",produces = "application/json")
//	public ArrayList<Student> getStudent()
//	{
//		ArrayList<Student> al=new ArrayList<Student>();
//		
//		Student s1=new Student(1, "Mohit", 90, "Malegoan");
//		al.add(s1);
//		al.add(new Student(2, "rajdeep", 95, "Pune"));
//		al.add(new Student(3, "vijay", 92, "Mumbai"));
//		al.add(new Student(4, "chandrashekhar", 85, "Nashik"));
//		return al;
//	}
//	
//	@ResponseBody
//	@GetMapping(value = "/getAll",produces = "application/json")
//	public HashMap<String, Student> m2()
//	{
//		HashMap<String, Student> hm=new HashMap<>();
//		hm.put("Rushi", new Student(5, "Rushi", 56, "Satana"));
//		hm.put("Avishkar", new Student(6, "Avishkar", 76, "Satara"));
//		hm.put("Ajinkya", new Student(7, "Ajinkya", 86, "Dhule"));
//		
//		return hm;
//	}

	@Autowired
	private StudentService studservice;
	
	@ResponseBody
	@GetMapping(value = "/students", produces = "application/json")
	public List<Student> getAllStudents()
	{
		return studservice.getAllStudents();
	}
	
	@ResponseBody
	@GetMapping(value = "/students/{rollno}")
	public ResponseEntity<Student> getStudentById(@PathVariable("rollno") int id)
	{
	
		Student obj= studservice.getStudentById(id);
		if(obj==null)
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<Student>(obj,HttpStatus.OK);
	}
	
	
	//json
	@ResponseBody
	@PostMapping(value = "/students")
	public boolean addStudent(@RequestBody Student s)
	{
		System.out.println("*************"+s);
		studservice.insertStudent(s);
		return true;
	}
	
	@ResponseBody
	@DeleteMapping(value = "/students/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("id") int sid)
	{
		Student s1=studservice.getStudentById(sid);
		studservice.deleteStudent(s1);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@ResponseBody
	@PutMapping(value = "/students/{sid}")
	public boolean updateStudent(@PathVariable("sid") int sid,@RequestBody Student s)
	{
		
		studservice.updateStudent(s);
		return true;
	}
	
	
	
}
