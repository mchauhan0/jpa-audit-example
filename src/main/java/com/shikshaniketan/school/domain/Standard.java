/**
 * 
 */
package com.shikshaniketan.school.domain;


import org.springframework.stereotype.Component;

/**
 * @author egcho
 *
 */
@Component
public class Standard {

	private Medium medium;
	private Level level;
	
	
	public Medium getMedium() {
		return medium;
	}
	public void setMedium(Medium medium) {
		this.medium = medium;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	
	
}
