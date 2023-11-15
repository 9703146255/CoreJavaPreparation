package com.rks.polymorphism.methodoverloading;
/*
 By changing the data type
 ===========================
 */
public class AdderOverload2 {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public double add(double a,double b)
	{
		return a+b+a;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}

}
