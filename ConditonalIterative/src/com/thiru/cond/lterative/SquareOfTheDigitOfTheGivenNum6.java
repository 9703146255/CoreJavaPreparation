package com.thiru.cond.lterative;

public class SquareOfTheDigitOfTheGivenNum6 {

	public static void main(String[] args) {
		
		int n=123,sum=0,r=0;
		while(n>0)
		{
		   r=n%10;
		   sum=sum+(r*r);
		   n=n/10;
		}
		System.out.println(sum);
		

	}

}
