/**
 * 
 */
package com.shikshaniketan.school.domain;

/**
 * @author egcho
 *
 */
public enum Course   {
	
BTECH("B-TECH"),HM("Hotel Management"),LLB("Legislative Law");
	

	private Course(String subject) {
		this.course=subject;
	}
	
	private final String course;
	

	public String getSubject() {
		return course;
	}
	
}
