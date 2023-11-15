package com.thiru.dataand.time;

import java.time.LocalDate;
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
 * LocalDate object
 * ===============
 *  getDayOfMonth(),
 *  getMonthValue(),
 *  getYear()
 * 
 * LocalTime time=LocalTime.now(); 
 * ==============================
 * getHour();
 * getMinute();
 * getSecond();
 * getNano();
 */

public class DateAndTime3 {

	public static void main(String[] args) {
		// Get default time 
		LocalTime time=LocalTime.now(); 
		System.out.println(time);
		System.out.println();
		
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		
		System.out.println(h+": "+m+" : "+s+" : "+n);
		System.out.println();
		System.out.printf(h+" : "+m+" : "+s+" : "+n);
		System.out.println();
		System.out.printf("\n%d-%d-%d-%d",h,m,s,n);
		System.out.println();
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		
		
		

	}

}
