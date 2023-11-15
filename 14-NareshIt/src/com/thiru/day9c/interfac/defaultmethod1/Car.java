package com.thiru.day9c.interfac.defaultmethod1;

public class Car implements Vehicle{

	@Override
	public void run() {
		System.out.println("Car is running!!");
		
	}

	@Override
	public void horn() {
		System.out.println("Car sound is => POP POP");
		
	}
	
	 @Override
	  public void digitalMeter()
	   {
		   System.out.println("Car is having digital Meter Facility");
	   }

}
