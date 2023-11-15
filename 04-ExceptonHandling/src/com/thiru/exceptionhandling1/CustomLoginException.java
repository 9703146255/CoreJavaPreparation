package com.thiru.exceptionhandling1;

public class CustomLoginException {

	public static void main(String[] args) throws LoginException {


		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
		  throw new LoginException(" LOGIN IS FAILED PLEASE CHECK THE CREDENTIALS RA THIRU");
		}

	}

}
