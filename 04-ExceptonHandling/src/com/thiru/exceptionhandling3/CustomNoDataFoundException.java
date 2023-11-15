package com.thiru.exceptionhandling3;

public class CustomNoDataFoundException {

	public static void main(String[] args) throws NoDataFoundException {
		int a=10;
		int b=0;
		int div;

		try
		{
			div=a/b;
		}
		catch(ArithmeticException ae)
		{
			throw new NoDataFoundException("No data found exception thirumalesh");
		}
		
		
		
		
	}

}
