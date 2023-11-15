package com.thiru.day7;

public class FactorsOfGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=20;
		for (int i = 1; i <= num; i++) 
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}

	}

}
