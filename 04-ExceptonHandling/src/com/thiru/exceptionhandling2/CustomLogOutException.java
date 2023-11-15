package com.thiru.exceptionhandling2;

public class CustomLogOutException {

	public static void main(String[] args) throws LogOutException{
		
		
		int[] a= {10,20,30,40};
		
	     
		try
		{
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException Aibe)
		{
			throw new LogOutException("Log out is failed due to lack of resources");
		}
		
		
		
		

	}

}
