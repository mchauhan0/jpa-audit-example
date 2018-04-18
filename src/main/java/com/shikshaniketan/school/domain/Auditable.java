/**
 * 
 */
package com.shikshaniketan.school.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.shikshaniketan.school.transformer.LocalDateConverter;


/**
 * @author egcho
 *
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

	@CreatedBy
	@Column(name="created_by",nullable=false)
	protected U createdBy;
	
	@LastModifiedBy
	@Column(name="last_modified_by",nullable=false)
	protected U lastModifiedBy;
	
	@CreatedDate
	@Column(name="created_on",nullable=false)
	@Convert(converter = LocalDateConverter.class)
	// @Temporal(TemporalType.TIMESTAMP)
	protected LocalDate createdOn;
	
	
	@LastModifiedDate
	@Column(name="last_modified_on",nullable=false)
	@Convert(converter = LocalDateConverter.class)
	// @Temporal(TemporalType.TIMESTAMP)
	protected LocalDate lastModifiedOn;


	public U getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(U createdBy) {
		this.createdBy = createdBy;
	}


	public U getLastModifiedBy() {
		return lastModifiedBy;
	}


	public void setLastModifiedBy(U lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}


	public LocalDate getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}


	public LocalDate getLastModifiedOn() {
		return lastModifiedOn;
	}


	public void setLastModifiedOn(LocalDate lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}
	
	
	

}
