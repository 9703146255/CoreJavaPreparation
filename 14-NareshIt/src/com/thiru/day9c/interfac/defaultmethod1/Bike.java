package com.thiru.day9c.interfac.defaultmethod1;

public class Bike implements Vehicle{

	@Override
	public void run() {
		System.out.println("Bike is running!!");
		
	}

	@Override
	public void horn() {
		System.out.println("Bike sound is => PEEP PEEP");	
		
	}

}
