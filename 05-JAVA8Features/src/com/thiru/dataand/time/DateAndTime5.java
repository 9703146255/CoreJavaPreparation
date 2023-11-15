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
 * LocalDate time=LocalDate.now();
 * ================================
 * getDayOfMonth(),
 * getMonthValue(),
 * getYear()
 * 
 * LocalTime time=LocalTime.now(); 
 * ==============================
 * getHour();
 * getMinute();
 * getSecond();
 * getNano();
 * 
 * LocalDateTime dt=LocalDateTime.now(); 
 * =====================================
 *  getDayOfMonth();
    getMonthValue();
    getYear();
		
    getHour();
	getMinute();
	getSecond();
	getNano();
	
	OUR REQUIRED FORMAT DATE AND TIME
	=================================
    LocalDateTime ldt=LocalDateTime.of(yy,mm,dd,h,m,s,n);
    
    1996,may,28
      12:45
	
 * 
 */

public class DateAndTime5 {

	public static void main(String[] args) {
//		LocalDateTime ldt=LocalDateTime.of(1996,8,28,12,45,33,55); 
//	    System.out.println(ldt);
		
		
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		int dd=ldt.getDayOfMonth();
		int mm=ldt.getMonthValue();
		int yyyy=ldt.getYear();
		
		int h=ldt.getHour();
		int m=ldt.getMinute();
		int s=ldt.getSecond();
		int ns=ldt.getNano();
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.printf("%d-%d-%d-%d",h,m,s,ns);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
