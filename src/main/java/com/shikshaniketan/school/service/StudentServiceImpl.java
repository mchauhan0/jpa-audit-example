package com.shikshaniketan.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shikshaniketan.school.domain.Student;
import com.shikshaniketan.school.repo.IStudentRepo;

@Service
public class StudentServiceImpl  implements IStudentService {

	@Autowired IStudentRepo iStudentRepo;
	
	
	/* (non-Javadoc)
	 * @see com.rbc.school.service.IStudntService#addNewStudent(com.rbc.school.domain.Student)
	 */
	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return iStudentRepo.save(student);
	}

	/* (non-Javadoc)
	 * @see com.rbc.school.service.IStudntService#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return iStudentRepo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		return iStudentRepo.save(student);
	}
}
