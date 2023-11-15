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
 * 
 */

public class DateAndTime4 {

	public static void main(String[] args) {
		// Get default time 
		LocalDateTime dt=LocalDateTime.now(); 
		System.out.println(dt);
		
		int dd=dt.getDayOfMonth();
		int mm=dt.getMonthValue();
		int yy=dt.getYear();
		
		int h=dt.getHour();
		int m=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();
		System.out.printf("%d:%d:%d",dd,mm,yy);
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
		

	}

}
