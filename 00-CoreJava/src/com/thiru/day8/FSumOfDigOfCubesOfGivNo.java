package com.thiru.day8;



/*
1) Prime number  ==> 1 and itself
2) Factors of a number ==> no div values
3) Perfect no
4) Sum of the digits of the given number
5) sum of Square of the digits of the given number
6) sum of Cubes of the digits of the given numbers
 */


public class FSumOfDigOfCubesOfGivNo {

	public static void main(String[] args) {
		
		
		


	
		
	
	 
		int num=123,sum=0,rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		
		System.out.println("sum of the digits of the given number is :"+sum);
		
		
	 
		
		
		
		
	
		
		
		
	
	
	
	
	
	
	
	
	
	

}
}