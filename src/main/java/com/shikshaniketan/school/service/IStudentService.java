package com.shikshaniketan.school.service;

import java.util.List;

import com.shikshaniketan.school.domain.Student;
public interface IStudentService {
	

	Student addNewStudent(Student student);
	List<Student> getAllStudents();
	Student updateStudent(Student student);

}
