package com.jsp.springbootstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootstudent.dao.StudentDao;
import com.jsp.springbootstudent.dto.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;
	//save
	public Student saveStudentService(Student s)
	{
		return dao.saveStudent(s);
	}
	//getbyall
	public List<Student>  getByAllService()
	{
		return dao.getByAll();
	} //getbyid
	public Student getByIdService(int id)
	{
		return dao.getById(id);
	}
	//update
	public Student updateStudentService(Student student)
	{
		return dao.updateStudent(student);
	}
	//delete
	public Student deleteStudentService(int id)
	{
		return dao.deleteStudent(id);
	}
}
