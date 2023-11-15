package com.thiru.cond.lterative;

public class CheckGivenNoIsPerfectOrNot2 {

	public static void main(String[] args) {
		
		
		int n=6,sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i; //1+2+3 =6
			}
		}
		if(n==sum)   //lhs==rhs
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("Not A perfect number");
		}
	}

}
