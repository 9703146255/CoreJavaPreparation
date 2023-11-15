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
	
	OUR REQUIRED FORMAT DATA AND TIME
	=================================
    LocalDateTime ldt=LocalDateTime.of(yy,mm,dd,h,m,s,n);
    
    1996,may,28
      12:45
      
      AFTER SOME DAYS WHAT IS THE DAY/MONTH/YEAR OR 
     
      =============================================
      plusYears(7)         Note:plus(Years,Months,Weeks,Days,Hours,Minutes,Seconds,Nanos)
      plusMonths(6)
      plusWeeks(7)
      plusDays(10)
      plusHours(7)
      plusMinutes(7)
      plusSeconds(7)
      plusNanos(7)
      
       BEFORE SOME DAYS WHAT IS THE DAY/MONTH/YEAR
       =============================================
      
   	  minusYears(7)	 	Note:minus(Years,Months,Weeks,Days,Hours,Minutes,Seconds,Nanos)
      minusMonths(6)
      minusWeeks(7)
      minusDays(10)
      minusHours(7)
      minusMinutes(7)
      minusSeconds(7)
      minusNanos(7)
	
 * 
 */

public class DateAndTime6 {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.of(1996,5,13,3,45,33,55); 
	    System.out.println(ldt);
	    //AFTER-> plus(n)
	    System.out.println("After six months 5 :"+ldt.plusYears(6));
	    System.out.println("After six months 5 :"+ldt.plusMonths(6));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.plusWeeks(7));
	    System.out.println("ldt.plusDays(10) 13 :"+ldt.plusDays(10));
	    System.out.println("ldt.plusHours(7) 3 :"+ldt.plusHours(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.plusMinutes(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.plusSeconds(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.plusNanos(7));
	    
	    //BEFORE-> minus(n)
	    System.out.println("After six months 5 :"+ldt.minusYears(6));
	    System.out.println("After six months 5 :"+ldt.minusMonths(6));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.minusWeeks(7));
	    System.out.println("ldt.plusDays(10) 13 :"+ldt.minusDays(10));
	    System.out.println("ldt.plusHours(7) 3 :"+ldt.minusHours(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.minusMinutes(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.minusSeconds(7));
	    System.out.println("ldt.plusMinutes(7) 33 :"+ldt.minusNanos(7));
	    
	   }

}
