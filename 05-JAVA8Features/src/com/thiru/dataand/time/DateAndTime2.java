package com.thiru.dataand.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * Date and Time
 * =============
 * Date,Caleder, TimeStamp,---->1.7v
 * 
 * Date and Time API -->1.8v --> JODA Time API-->Joda.org foundation
 * 
 * current system date==> LocalDate date=LocalDate.now(); 
 * Current system time==> LocalTime time=LocalTime.now();
 * 
 * 
 * LocalDate object -->getDayOfMonth(),getMonthValue(),getYear()
 * 
 * 
 */

public class DateAndTime2 {

	public static void main(String[] args) {
		// Get default date 
//		LocalDate date=LocalDate.now(); 
//		System.out.println(date);
//		
//		// retraive day, month and year	 gdm,gmv.gy
//		int dd=date.getDayOfMonth();
//		int mm=date.getMonthValue();
//		int yyyy=date.getYear();
//		
//		System.out.println(dd+" : "+mm+" : "+yyyy);
//		
//		//TO FORMAT OUR REQUIRED FORMAT DATE
//		System.out.printf("%d-%d-%d",yyyy,mm,dd);
//		System.out.printf("\n%d-%d-%d",dd,yyyy,mm);
//		System.out.printf("\n%d-%d-%d",dd,mm,yyyy);
//		
		
		
		
		
		
		
		
		LocalDateTime date=LocalDateTime.now();
		int dd=date.getDayOfMonth();
		int mmm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.printf("%d-%d-%d",dd,mmm,yyyy);
		System.out.printf("\n%d-%d-%d",mmm,dd,yyyy);
		System.out.printf("\n%d-%d-%d",yyyy,dd,mmm);
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
