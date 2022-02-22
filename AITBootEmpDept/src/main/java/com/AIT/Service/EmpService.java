package com.AIT.Service;

import java.util.List;

import com.AIT.Model.Employee;

public interface EmpService {
	
	void insertEmployee(Employee e);
	
	void deleteEmployeeById(int id);
	
	void updateEmployee(Employee e);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(int id);
	
	public List<Employee> getEmpByDeptname(String d);

}
