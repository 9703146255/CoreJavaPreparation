 package com.thiru.dataand.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/*JAVA 1.8
 * ==========
 * Date and Time
 * =============
 * Date,Calender, TimeStamp,---->1.7v
 * 
 * Date and Time API -->1.8v --> JODA Time API-->Joda.org foundation
 * 
 * current system date==> LocalDate date=LocalDate.now(); 
 * Current system time==> LocalTime time=LocalTime.now();
 * 
 */

public class DateAndTime1 {

	public static void main(String[] args) throws ParseException {
		
		


		

		
		//get day month and year methods
//	    LocalDate date=LocalDate.now();
//	    System.out.println(date);
//	    int dd=date.getDayOfMonth();
//	    int mm=date.getMonthValue();
//	    int yyyy=date.getYear();
//	    
//	    
//	    
//	    System.out.printf("%d===%d====%d",dd,mm,yyyy);
			
	    
	   
	    
	    
			
//	    System.out.println();
//		LocalTime time=LocalTime.now();
//		int hh1=time.getHour();
//		int mm1=time.getMinute();
//		int ss1=time.getSecond();
//		int nn1=time.getNano();
//		
//		System.out.printf("%d-%d-%d-%d",hh1,mm1,ss1,nn1);
//		
		
		  
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter your dob [yyyy-MM-dd] :");
		  String birthdateStr=sc.next();
		  System.out.println(birthdateStr);
		  
		  Date birthdate = null;
		  
		  birthdate = dateFormat.parse(birthdateStr);
		  
		  // Calculate age
	      Date currentDate = new Date();
	      long ageInMillis = currentDate.getTime() - birthdate.getTime();
	      int age = (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));
	      boolean isEligible = age >= 18;
	      
	      if(isEligible)
	      {
	    	  System.out.println("your eligibile for vote"+age);
	      }
	      else
	      {
	    	  System.out.println("your not eligible for vote");
	      }
	      
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter your dob :[dd/mm/yyyy]");
//			String dob=sc.next();
//		
//		
//		
//		   LocalDate ldt=LocalDate.of(1998,04,28); 
//		   LocalDate loacaldate=LocalDate.now();
//		   System.out.println(loacaldate);
//		   int date=loacaldate.getDayOfMonth();
//		   int month=loacaldate.getMonthValue();
//		   int year=loacaldate.getYear();
		
		
		//local time
		
		
//		LocalTime lt=LocalTime.now();
//		System.out.println(lt);
//		int hour = lt.getHour();
//		int minute = lt.getMinute();
//		int second = lt.getSecond();
//		int nano = lt.getNano();
//		
//		System.out.println("hour : "+hour+" minute : "+minute+" seconds : "+second+" nano seconds : "+nano);  //or
//		System.out.printf("hour : %d minute : %d seconds : %d nano seconds %d ",hour,minute,second,nano);

	      
	      //local date
//		LocalDate dt=LocalDate.now();
//		System.out.println(dt);
//		int dayOfYear = dt.getDayOfYear();
//		int dayOfMonth = dt.getDayOfMonth();
//		int monthValue = dt.getMonthValue();
//		int year = dt.getYear();
//		System.out.printf("dayOfYear : %d dayOfMonth : %d monthValue : %d year : %d",dayOfYear,dayOfMonth,monthValue,year);
//		
		
		
		   
		
		
		
		
		
		
		
		
		
	}

}
