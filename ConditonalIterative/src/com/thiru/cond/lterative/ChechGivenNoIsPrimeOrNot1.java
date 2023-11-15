package com.thiru.cond.lterative;

public class ChechGivenNoIsPrimeOrNot1 {

	public static void main(String[] args) {
		
		int n=6,count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
		System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
