package com.charuka.springdemo;

public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "30 min batting practice";
	}
}
