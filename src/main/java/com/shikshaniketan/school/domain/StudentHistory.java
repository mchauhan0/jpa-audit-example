package com.shikshaniketan.school.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.shikshaniketan.school.transformer.LocalDateTimeConverter;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class StudentHistory {
	

	@Id
	@GeneratedValue
	private Long id;
	
	
    @ManyToOne
    @JoinColumn(name = "student_id", foreignKey=@ForeignKey(name="fk_student"))
    private Student student;

    @Column(name="first_name", length=25, nullable=false)
	private String firstName;
	
	@Column(name="last_name",length=25, nullable=false)
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private Course course;
	
	@Enumerated(EnumType.STRING)
	private Medium medium;
		
	@Column(name="contact_no", nullable=false)
	private String  contactNo;
	
	@Column(name="email_id", nullable=false)
	private String  emailId;
	

    @LastModifiedBy
    private String modifiedBy;

    @LastModifiedDate
    // @Temporal(TemporalType.TIMESTAMP)
	@Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime modifiedDate;

    @Enumerated(EnumType.STRING)
    private Action action;

    public StudentHistory(Student student, Action action) {
	
    	this.student=student;
    	this.action=action;
    	this.firstName= student.getFirstName();
    	this.lastName=student.getLastName();
    	this.course=student.getCourse();
    	this.medium=student.getMedium();
    	this.contactNo= student.getContactNo();
    	this.emailId=student.getEmailId();
    	
    }

}
