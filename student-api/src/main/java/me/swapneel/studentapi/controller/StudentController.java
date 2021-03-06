package me.swapneel.studentapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import me.swapneel.studentapi.dao.StudentDao;
import me.swapneel.studentapi.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return (List<Student>) dao.findAll();
	}
	
	@RequestMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int rollNo) {
		Optional<Student> student = dao.findById(rollNo);
		return student;
	}
	
}
