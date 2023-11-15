package com.thiru.numbers;

import java.util.Scanner;

public class EPolindromeString {

	public static void main(String[] args) {

		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the polindrome number :");
		String name=sc.next();
		int size=name.length();
		String s="";
		for(int i=size-1;i>=0;i--)
		{
			s=s+name.charAt(i);
		}
		System.out.println(s);
		if(name.equals(s))
		{
			System.out.println("polindrome String");
		}
		else
		{
			System.out.println("Not a polinrome string");
		}
		
	}

}
