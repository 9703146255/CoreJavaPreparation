package com.thiru.strings1;
/*
 Given a string, return a "rotated right 2" 
 version where the last 2 chars are moved to the start. 
 The string length will be at least 2.
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
public class No_11_Right2 {
	
public static String right2(String s)	
{
	return s.substring(s.length()-2)+s.substring(0,s.length()-2);
}
	
	
	
public static void main(String[] args) {
		
System.out.println(right2("Hello") );
System.out.println(right2("java"));
System.out.println(right2("Hi"));
	}

}
