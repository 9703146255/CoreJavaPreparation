package com.thiru.numbers;

public class BReversingOfNumber {

	public static void main(String[] args) {
		
		
		
		//METHOD-1
		
//		int n=1234,rem;
//		int temp=n;
//		int sum=0;
//		while(n>0)
//		{
//			rem=n%10;
//			sum=sum*10+rem;
//			n=n/10;
//			
//		}
//		System.out.println("Before : "+temp); //n=0
//		System.out.println("After Reverse : "+sum);
		
		
		
		//METHOD-2
		
//		int num=12345;
//		StringBuffer sb1=new StringBuffer();
//		System.out.println("Before : "+num); 
//		sb1.append(num);
//		System.out.println("After Reverse : "+sb1.reverse());
		
		
		//METHOD-3
		int num=123456;
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb2.hashCode());
		sb2.append(num);
		System.out.println();
		System.out.println("Before : "+num); 
		System.out.println("After Reverse : "+sb2.reverse());
		
	}

}
