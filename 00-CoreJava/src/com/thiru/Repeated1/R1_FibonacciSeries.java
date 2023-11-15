package com.thiru.Repeated1;
//Fibonacci series
public class R1_FibonacciSeries {

	public static void main(String[] args) {
		
		int[] x=new int[10];
		x[0]=0;
		x[1]=1;
		System.out.println(x[0]);
		System.out.println(x[1]);
		for(int i=2;i<10;i++)
		{
			x[i]=x[i-1]+x[i-2];
			System.out.println(x[i]);
		}
		
	
	}

}

