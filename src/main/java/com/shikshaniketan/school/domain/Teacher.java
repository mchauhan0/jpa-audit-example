/**
 * 
 */
package com.shikshaniketan.school.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.shikshaniketan.school.listener.TeacherEntityListener;

/**
 * @author egcho
 *
 */
@Entity(name="faculty_detail")
@EntityListeners(TeacherEntityListener.class)
public class Teacher implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	
	
	@Column(name="first_name", nullable=false)
	private String  firstName;
	
	@Column(name="last_name", nullable=false)
	private String  lastName;
	
	@Column(name="contact_no", nullable=false)
	private String  contactNo;
	
	@Column(name="email_id", nullable=false)
	private String  emailId;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNo=" + contactNo
				+ ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	
	

}
