package com.thiru.day9c.interfac.defaultmethod1;

public interface Vehicle {
	
		void run();
	    void horn();
	   
	   default void digitalMeter() //by default AM is public
	   {
		   System.out.println("Digital Meter Facility");
	   }

}
