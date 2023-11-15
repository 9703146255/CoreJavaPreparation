package com.thiru.dataand.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

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
      
      AFTER SOME DAYS WHAT IS THE DAY/MONTH/YEAR OR 
     
      =============================================
      plusYears(7)
      plusMonths(6)
      plusWeeks(7)
      plusDays(10)
      plusHours(7)
      plusMinutes(7)
      plusSeconds(7)
      plusNanos(7)
       BEFORE SOME DAYS WHAT IS THE DAY/MONTH/YEAR
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
	Period p1=Period.between(Birthday, deathDate);
	
	CHECK WEATHER GIVEN YEAR IS LEAP OR NOT
 * 
 */

public class DateAndTime8 {

	public static void main(String[] args) {
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the year number : ");
//		int n=sc.nextInt();
//		
//		Year y=Year.of(n); //LocalDate date=LocalDate.of(some date)
//		if(y.isLeap())
//		{
//			System.out.println("given year is leap year.");
//		}
//		else
//		{
//			System.out.println("given year is not a leap year.");
//		}
//	    
		
		
		
//		Scanner sc=new Scanner(System.in);
//	
//		System.out.println("Enter the year");
//		int n=sc.nextInt();
		int n=2000;
//		
		Year y=Year.of(n);
		
		if(y.isLeap())
		{
			System.out.println("given year is leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		
		
		
		
		
		
		
		
	   }

}
