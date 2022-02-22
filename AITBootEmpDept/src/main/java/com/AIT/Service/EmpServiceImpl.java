package com.AIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIT.Model.Employee;
import com.AIT.dao.EmpDao;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao edao;

	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		edao.save(e);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmpByDeptname(String d) {
		// TODO Auto-generated method stub
		return edao.getEmpByDeptname(d);
	}

}
