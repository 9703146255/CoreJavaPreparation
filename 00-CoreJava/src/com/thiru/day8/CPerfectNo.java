package com.thiru.day8;



/*
1) Prime number  ==> 1 and itself
2) Factors of a number ==> no div values
3) Perfect no
4) Sum of the digits of the given number
5) sum of Square of the digits of the given number
6) sum of Cubes of the digits of the given numbers
 */


public class CPerfectNo {

	public static void main(String[] args) {
		
		
		
	System.out.print("Factors of the given numbers is : ");
	
	int num=6,sum=0,temp;
	
	temp=num;
	
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum =sum+i;
		}
		
	}
	
	if(temp==sum)
	{
		System.out.println("perfect no");
	}
	else
	{
		System.out.println("not a perfect no");
	}
	
		
		
	/*
		System.out.print("Factors of the given numbers is : ");
		int num=6;
		
		int start=1;
		int sum=0;
		int temp=num;
		
		while(start<num)
		{
			if(num%start==0)
			{
				System.out.print(start +", ");
				sum=sum+start;
				
			}
			start++;
			
		}
		
		
		System.out.println();
		if(temp==sum)
		{
			System.out.println("given number is Perfect number");
		}
		else 
		{
			System.out.println("given number isnot a perfect number");
		}
		
		
		
		
		*/
		
		
		
		
		/*
		System.out.print("Factors of the given numbers is : ");
		int num=6;
		int start=1;
		int sum=0;
		int temp=num;
		
		do
		{
			if(num%start==0)
			{
				System.out.print(start +", ");
				sum=sum+start;
				
			}
			start++;
			
		}
		while(start<num);
		
		System.out.println();
		if(temp==sum)
		{
			System.out.println("given number is Perfect number");
		}
		else 
		{
			System.out.println("given number isnot a perfect number");
		}
		
		*/
	
	
	
	
	
	
	
	
	

}
}