package com.AIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.AIT.Dao.StudentDao;
import com.AIT.Model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao sdao;
	
//	@GetMapping("/students")
//	public List<Student> m1()
//	{
//		return sdao.findAll();
//	}
	
	
	@GetMapping("/students")
	public ModelAndView m1()
	{
		List<Student> lst=sdao.findAll();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("studlist",lst);
		return mv;
	}

}
