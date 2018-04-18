package com.shikshaniketan.school.domain;

public enum Level {

	
FIRST("1st"),SECOND("2nd"),THIRD("3rd");
	

	private Level(String level) {
		this.level=level;
	}
	
	private final String level;
	

	public String getLevel() {
		return level;
	}
	
}
