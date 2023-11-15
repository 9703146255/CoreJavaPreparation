package com.thiru.dataand.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

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
    LocalDateTime ldt=LocalDateTime.of(yy,mm,ddh,m,s,n);
    
    1996,may,28
      12:45
      
      AFTER SOME DAYS WHAT IS THE DAY/MONTH/YEAR OR //ADDING DATE AND TIME
     
      =============================================
      plus Years(7)
      plus Months(6)
      plus Weeks(7)
      plus Days(10)
      plus Hours(7)
      plus Minutes(7)
      plus Seconds(7)
      plus Nanos(7)
       BEFORE SOME DAYS WHAT IS THE DAY/MONTH/YEAR //SUBSTRACTING DATE AND TIME
       =============================================
      
   	  minusYears(7)
      minusMonths(6)
      minusWeeks(7)
      minusDays(10)
      minusHours(7)
      minusMinutes(7)
      minusSeconds(7)
      minusNanos(7)
      
      I WANT TO FIND THE DIFFERENCE BETWEEN TODAY AND BIRTH DAY DATE OR YOUR AGE
      ==========================================================================
	   Period p1=Period.between(Birthday, today);
 * 
 */

public class DateAndTime7 {

	public static void main(String[] args) {
//		LocalDate Birthday=LocalDate.of(1996,8,04); 
//		LocalDate today=LocalDate.now();
//		
//		Period p=Period.between(Birthday, today);
//		
//		
//		System.out.printf("Age is %d Years, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());
//		LocalDate deathDate=LocalDate.of(1996+60,8,04);
//		
//		Period p1=Period.between(Birthday, deathDate);
//		int d=p1.getYears()*365+p1.getMonths()*12+p1.getDays();
//		
//		System.out.printf("\nYou will be on the earth only : %d please do all activities what you want",d);
		
		
//		LocalDate dob=LocalDate.of(1998,8,04);
//		LocalDate today=LocalDate.now();
//		
//		Period p=Period.between(dob, today);
//		int d=p.getYears()*365+p.getMonths()*12+p.getDays();
//		System.out.printf("Age is %d Years, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
		
		LocalDate today=LocalDate.now();
		LocalDate borthday=LocalDate.of(1998, 8, 04);
		Period p=Period.between(borthday, today);
		if(p.getYears() >= 18)
		{
			System.out.println(" your eligible for vote.. "+p.getYears());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	   }

}
