package com.thiru.exceptionhandling4;

public class UsingException
{
 public static void main(String[] args) throws LoginException
 {
	
	 int x=10;
	 int y=0;
	 int result;
	try {
		result = x/y;
	} catch (Exception e) {
		throw new LoginException("your not access to login here");
	}
	
	
	 
	 
	 
 
 
 }
}
