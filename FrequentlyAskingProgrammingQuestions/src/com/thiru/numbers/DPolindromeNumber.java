package com.thiru.numbers;

import java.util.Scanner;

public class DPolindromeNumber {

	public static void main(String[] args) {

		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the polindrome number :");
		int num=sc.nextInt();
		int temp=num;
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("given number is polindrome number");
		}
		else
		{
			System.out.println("given number is not a polindrome number");
		}
		
	}

}
