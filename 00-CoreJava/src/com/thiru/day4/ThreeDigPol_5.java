package com.thiru.day4;

public class ThreeDigPol_5 {

	public static void main(String[] args) {
//		int x,y,z,inpt=151;
//		/*
//		 x=>inpt=>y=>z
//		 %=>/=>%=>/
//		 x==z(first==last)
//		 
//		 */
//		x=inpt%10;
//		inpt=inpt/10;
//		y=inpt%10;
//		z=inpt/10;
//		
//		System.out.println(inpt);
//		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
//		
//		if(x==z)
//		{
//			System.out.println("three dig pol");
//		}
//		else
//		{
//			System.out.println("not three dig pol");
//		}

		
		//only applicable 3 digit numbers
//		int x,y,z,inpt=151;
//		x=inpt%10;
//		inpt=inpt/10;
//		y=inpt%10;
//		z=inpt/10;
//		
//		if(x==z)
//		{
//			System.out.println("polindrome");
//		}
//		else
//		{
//			System.out.println("not a polindrome");
//		}
//		
		
		
		
		//check given number is polindrome or not applicable for all
//		int n=123454321;
//		int sum=0;
//		int temp=n;
//		
//		while(n>0)
//		{
//			int rem=n%10;
//			sum=sum*10+rem;
//			n=n/10;
//			
//		}
//		if(temp==sum)
//		{
//			System.out.println("polindrome number");
//		}
//		else
//		{
//			System.out.println("not a polindrom number");
//		}
//		
		
		

		//check given number is  polidnroe or not
		
		int num=234565432;
		int sum=0;
		int temp=num;
		while(num > 0)
		{
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num /10 ;
		}
		if(sum==temp)
		{
			System.out.println("given number is a polindrome number...");
		}
		else
		{
			System.out.println("given number is not a polindrome number..");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
