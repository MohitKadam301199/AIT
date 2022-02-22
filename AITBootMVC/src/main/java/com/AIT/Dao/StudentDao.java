package com.AIT.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AIT.Model.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
