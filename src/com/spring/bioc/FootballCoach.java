package com.spring.bioc;

public class FootballCoach implements Coach {

	String instruction="practice goal daily 1hr";
	
	@Override
	public String getDailyWorkout() {
		
		return instruction;
	}

}
