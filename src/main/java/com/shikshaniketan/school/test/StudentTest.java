package com.shikshaniketan.school.test;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;

import com.shikshaniketan.school.domain.Course;
import com.shikshaniketan.school.domain.Student;
import com.shikshaniketan.school.repo.IStudentRepo;

public class StudentTest {

	@Autowired IStudentRepo iStudentRepo;
	
	@BeforeClass
	public void createStudent() {
		Student student = new Student();
		student.setFirstName("A");
		student.setLastName("C");
		student.setContactNo("9818636448");
		student.setCourse(Course.BTECH);
		student.setMotherName("Father");
		System.out.println("starting createStudent");
		
		iStudentRepo.save(student);
		
		System.out.println("finished createStudent");
	}
}
