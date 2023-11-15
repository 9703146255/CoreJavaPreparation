package com.thiru.day8a;
/*
 1)Each line 4 values

 
 */

public class Print4nosEveryLine {

	public static void main(String[] args) {
		
		System.out.println("==============Each line 4 values=============");
		int num=15;
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+" ");
			if(i%4==0)
			{
				System.out.println();
			}
			
			
		}

		System.out.println();
		System.out.println("==============Each line 5 values=============");
		int num1=15;
		for(int i=1;i<=num1;i++)
		{
			System.out.print(i+" ");
			if(i%5==0)
			{
				System.out.println();
			}
			
			
		}
		
		
		
		System.out.println("==============Each line 6 values=============");
		int num2=15;
		for(int i=1;i<=num2;i++)
		{
			System.out.print(i+" ");
			if(i%6==0)
			{
				System.out.println();
			}
		}
		
	}

}
