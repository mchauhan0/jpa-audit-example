/**
 * 
 */
package com.shikshaniketan.school.listener;

import javax.persistence.EntityManager;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.shikshaniketan.school.domain.Action;
import com.shikshaniketan.school.domain.Student;
import com.shikshaniketan.school.domain.StudentHistory;
import com.shikshaniketan.school.util.BeanUtil;

/**
 * @author egcho
 *
 */
@Component
public class StudentEntityListner {

	@PrePersist
	public void prePersist(Student target) {
		perform(target, Action.INSERT);
	}

	@PreUpdate
	public void preUpdate(Student target) {
		perform(target, Action.UPDATE);
	}

	@PreRemove
	public void preRemove(Student target) {
		perform(target, Action.DELETE);
	}

	@Transactional
	private void perform(Student student, Action action) {
		  EntityManager entityManager = BeanUtil.getBean(EntityManager.class);
		   entityManager.persist(new StudentHistory(student, action));
	     
		switch (action) {
		case INSERT:
			System.err.println("Inserting : "+student.toString());
			break;
		case UPDATE:
			System.err.println("Updating : "+student.toString());
			break;
		case DELETE:
			System.err.println("Deleting : "+student.toString());
			break;

		default:
			System.err.println("Unknown Action");
			break;
		}

	}

}
