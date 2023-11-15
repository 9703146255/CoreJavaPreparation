package com.thiru.exceptionhandling1;
//step-1 ==>our class should extends the Exception class
//step-2 ==> create constructor with var message it will use from seper key word
public class LoginException extends Exception
{
	
	
	//CONSTRUCTOR
		public LoginException(String message)
		{
			super(message);
		}
    
}