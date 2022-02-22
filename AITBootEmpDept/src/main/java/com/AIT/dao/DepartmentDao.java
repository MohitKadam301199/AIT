package com.AIT.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AIT.Model.Department;

public interface DepartmentDao extends JpaRepository<Department,Integer> {

}
