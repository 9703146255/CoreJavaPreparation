package com.thiru.exceptionhandling5;

public class UsingLogOutException {

	public static void main(String[] args) throws LogOutException {
		int[] x = { 10, 20, 30 };

		try 
		{
			System.out.println(x[3]);
		}
		catch (Exception e) 
		{
            new LogOutException("you don't have access to logout this app");
		}

	}

}
