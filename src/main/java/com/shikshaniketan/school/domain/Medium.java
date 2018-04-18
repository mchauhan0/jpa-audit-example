/**
 * 
 */
package com.shikshaniketan.school.domain;

/**
 * @author egcho
 *
 */
public enum Medium {
	
	HINDI("Hindi"),ENGLISH("English");
	
	private final String medium;
	
	private Medium(String medium ) {
	this.medium=medium;
	}
	public String getMedium() {
		return medium;
	}
	
}
