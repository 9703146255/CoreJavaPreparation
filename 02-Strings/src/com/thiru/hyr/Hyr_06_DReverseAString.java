 package com.thiru.hyr;

import java.util.Scanner;


public class Hyr_06_DReverseAString {

	public static void main(String[] args) {
		//Write a java program count the total number of occurences of character in a given string

//			Scanner sc=new Scanner(System.in);
//			System.out.println("Please enter the input string :");
//			String input=sc.nextLine();
//			char[] x=input.toCharArray();
//			String sum="";
//			
//			for(int i=x.length-1;i>=0;i--)
//			{
//				sum=sum+x[i];
//			}
//		      System.out.println(sum);
		
		
//		String name="golla thirumalesh hi";
//		char[] x=name.toCharArray();
//		
//		for(int i=x.length-1;i>=0;i--)
//		{
//			System.out.print(x[i]);
//		}

		
//		String name="thirumalesh";
//		char[] x=name.toCharArray();
//		int len=name.length();
//		String sum="";
//		for(int i=len-1;i>=0;i--)
//		{
//			sum=sum+x[i];
//		}
//		System.out.println(sum);
		
		
		String name="RACECAR1";
		char[] x=name.toCharArray();
		int len=name.length();
		String sum="";
		for(int i=len-1;i>=0;i--)
		{
			sum=sum+x[i];
		}
		if(name.equals(sum))
		{
			System.out.println("given string is polindrome");
		}
		else
		{
			System.out.println("given strin is not polindrome");
		}
		
		
		
	}

}
