/**
 * 
 */
package com.shikshaniketan.school.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.springframework.stereotype.Component;

import com.shikshaniketan.school.domain.Action;
import com.shikshaniketan.school.domain.Teacher;

/**
 * @author egcho
 *
 */
@Component
public class TeacherEntityListener {

	@PrePersist
	public void prePersist(Teacher teacher) {
		perform(teacher, Action.INSERT);
	}

	@PreUpdate
	public void preUpdate(Teacher teacher) {
		perform(teacher, Action.UPDATE);
	}

	@PreRemove
	public void preRemove(Teacher teacher) {
		perform(teacher, Action.DELETE);
	}

	private void perform(Teacher teacher, Action action) {
		switch (action) {
		case INSERT:
			System.err.println("Inserting : " + teacher.toString());
			break;
		case UPDATE:
			System.err.println("Updating : " + teacher.toString());
			break;
		case DELETE:
			System.err.println("Deleting : " + teacher.toString());
			break;

		default:
			System.err.println("Unknown Action");
			break;
		}

	}

}
