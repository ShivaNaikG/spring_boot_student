package com.jsp.springbootstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootstudent.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer > {

}
