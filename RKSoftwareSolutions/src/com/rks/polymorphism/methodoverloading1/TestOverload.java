package com.rks.polymorphism.methodoverloading1;

public class TestOverload {

	public static void main(String[] args)
	{
		System.out.println("main with String[]");
	}
	public static void main(String args)
	{
		System.out.println("main with String");
	}
	public static void main()
	{
		System.out.println("main without args");
	}

}
