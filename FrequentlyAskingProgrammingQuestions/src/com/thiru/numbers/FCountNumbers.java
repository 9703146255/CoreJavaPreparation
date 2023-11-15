package com.thiru.numbers;

public class FCountNumbers {

	public static void main(String[] args) {
		
		
		int num=123456789;
		int count =0;
		while(num > 0)
		{
			num=num%10;
			 count++;
			num--;
		}
		
		System.out.println("Nuber of numbers in a given number is :"+count);
		

	}

}
