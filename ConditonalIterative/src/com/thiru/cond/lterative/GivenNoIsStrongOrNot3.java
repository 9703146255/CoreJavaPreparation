package com.thiru.cond.lterative;

public class GivenNoIsStrongOrNot3 {

	public static void main(String[] args) {

		//Strong numbers logic  ex: 145 --> 1!+4!+5!=1+24+120  1,2,145 ...etc
		
		
		int n=5,r=0,sum=0;
	
		
		while(n>0)
		{
			r=n%10;
			int fact=1;
		
		while(r>n)
		{
			fact=fact * r;
			r=r-1;
			sum=sum+fact;
			n=n/10;
			
			
			
		}
	System.out.println(sum);
		
		

	}
}
}
