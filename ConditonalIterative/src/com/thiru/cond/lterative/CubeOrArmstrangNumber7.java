package com.thiru.cond.lterative;

public class CubeOrArmstrangNumber7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153,sum=0;
		int temp=n;
		while(n>0)
		{
		  int r=n%10;
		   sum=sum+(r*r*r);
		   n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong");
		}

	}

}
