package com.shikshaniketan.school.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shikshaniketan.school.domain.Student;

@Repository
public interface IStudentRepo  extends JpaRepository<Student, Long>{

}
