package com.AIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AIT.Model.Employee;
import com.AIT.Service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	private EmpService eservice;
	
	@PostMapping("/emp")
	public void addEmp(@RequestBody Employee ob)
	{
		eservice.insertEmployee(ob);
	}
	
	@GetMapping("/employees")
	public List<Employee> getALL()
	{
		return eservice.getAllEmployees();
	}
	
	@GetMapping("/employess/dept/{dname}")
	public List<Employee> getByDeptName(@PathVariable String dname)
	{
		return eservice.getEmpByDeptname(dname);
	}

}
