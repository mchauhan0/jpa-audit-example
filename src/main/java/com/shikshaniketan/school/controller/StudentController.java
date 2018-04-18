package com.shikshaniketan.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shikshaniketan.school.domain.Student;
import com.shikshaniketan.school.service.IStudentService;

@Controller
public class StudentController {
	

	@Autowired
	private IStudentService iStudntService;


	@PostMapping("student")
	public Student addNewStudent(@RequestBody Student student) {
		return iStudntService.addNewStudent(student);	
	}
	
	
	@GetMapping("student")
	public List<Student> getAllStudents(){
		return iStudntService.getAllStudents();	
	}
	
	
	@PutMapping("student")
	public Student updateStudent(@RequestBody Student student){
		return iStudntService.updateStudent(student);	
	}
	

}
