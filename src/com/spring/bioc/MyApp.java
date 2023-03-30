package com.spring.bioc;

public class MyApp {
	
	public static void main(String[] args) {
		
		Coach coach=new BaseballCoach();
		
		System.out.println("the baseball coach instructions is "+coach.getDailyWorkout());
		
		Coach coach2=new FootballCoach();
		
		System.out.println("the football coach instructions is "+coach2.getDailyWorkout());

		
	}

}
