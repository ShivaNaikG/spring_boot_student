package com.jsp.springbootstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootstudent.dto.Student;
import com.jsp.springbootstudent.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService service;
//save
@PostMapping("/student")
public Student saveStudent(@RequestBody Student student)
{
	return service.saveStudentService(student);
}
//getbyall
@GetMapping("/student")
public List<Student>  getByAll()
{
	return service.getByAllService();
}
//getbyid
@GetMapping("/student/{id}")
public Student getById(@PathVariable int id )
{
	return service.getByIdService(id);
}
//update 
@PutMapping("/student")
public Student update(@RequestBody Student student)
{
	return service.updateStudentService(student);
}
//delete
@DeleteMapping("/student/{id}")
public Student delete(@PathVariable int id)
{
	return service.deleteStudentService(id);
}
}
