/**
 * 
 */
package com.shikshaniketan.school.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.shikshaniketan.school.listener.StudentEntityListner;


/**
 * @author egcho
 *
 */
@Entity(name="student_detail")
@EntityListeners(StudentEntityListner.class)
public class Student  implements Serializable{ // extends Auditable<String>
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	@Enumerated(EnumType.STRING)
	private Course course;
	
	@Enumerated(EnumType.STRING)
	private Medium medium;
		
	@Column(name="first_name", nullable=false)
	private String  firstName;
	
	@Column(name="last_name", nullable=false)
	private String  lastName;
	
	@Column(name="contact_no", nullable=false)
	private String  contactNo;
	
	@Column(name="email_id", nullable=false)
	private String  emailId;
	
	@Column(name="mother_name", nullable=false)
	private String  motherName;
	
	/*@Convert(converter = LocalDateConverter.class)
	private LocalDate dob;*/

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public Course getCourse() {
		return course;
	}




	public void setCourse(Course course) {
		this.course = course;
	}




	public Medium getMedium() {
		return medium;
	}




	public void setMedium(Medium medium) {
		this.medium = medium;
	}




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




	public String getMotherName() {
		return motherName;
	}




	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}




	/*public LocalDate getDob() {
		return dob;
	}




	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
*/



	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", course=" + course + ", medium=" + medium + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", emailId=" + emailId
				+ ", motherName=" + motherName + ", dob=" +  "not there ]";
	}
	
	

	
	

}
