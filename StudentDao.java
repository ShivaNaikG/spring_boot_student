package com.jsp.springbootstudent.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootstudent.dto.Student;
import com.jsp.springbootstudent.repository.StudentRepository;

@Repository
public class StudentDao {
@Autowired
StudentRepository repository;
//save
public Student saveStudent(Student student)
{
	return repository.save(student);
}
//getbyall
public List<Student>  getByAll()
{
	return repository.findAll();
}
//getbyid
public Student getById(int id)
{
	Optional<Student> optional= repository.findById(id);
	return optional.get();
}
//update
public Student updateStudent(Student student)
{
 Optional<Student>optional=repository.findById(student.getId());
 if(optional != null)
 {
	return  repository.save(student);
 }
 return optional.get();
}
//delete
public Student deleteStudent(int id)
{
 Optional<Student>optional=repository.findById(id);
 if(optional != null)
 {
	 repository.delete(optional.get());
 }
 return optional.get();
}
}
