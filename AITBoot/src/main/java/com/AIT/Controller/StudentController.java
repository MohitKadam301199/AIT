package com.AIT.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AIT.Dao.StudentDao;
import com.AIT.Model.Student;
import com.AIT.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studservice;
	
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return studservice.getAllStudent();
	}
	
	@PostMapping("/student")
	public ResponseEntity<Void> addStudent(@RequestBody Student s1)
	{
        studservice.insertStudent(s1);
		return new ResponseEntity<Void>(HttpStatus.OK);	
	}
	
//	@GetMapping("/students/{id}")
//	public ResponseEntity<Student> getStudent(@PathVariable("id") int sid)
//	{
//		Optional<Student> o= sdao.findById(sid);
//		if(o.isPresent())
//			return new ResponseEntity<Student>(o.get(),HttpStatus.OK);
//		else
//			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);		
//	}
	
	@GetMapping("/student/{id}")
	public Student getStud(@PathVariable("id") int sid)
	{
		return studservice.getStudentById(sid);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Void> deleteStud(@PathVariable("id") int sid)
	{
		try {
			studservice.deleteStudent(sid);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/students/city/{city}")
	public List<Student> getByCity(@PathVariable("city") String city)
	{
		return studservice.findByCity(city);
		
	}
	
	@GetMapping("/students/percent/{percent}")
	public List<Student> getByPercent(@PathVariable("percent") int percent)
	{
		return studservice.findByPercentGreaterThan(percent);
		
	}
	
	@GetMapping("/students/sortpercent")
	public List<Student> sortByPercent()
	{
		return this.studservice.sortByPercent();
	}
	              
}
