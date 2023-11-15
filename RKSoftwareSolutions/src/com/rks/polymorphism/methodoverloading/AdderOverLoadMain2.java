package com.rks.polymorphism.methodoverloading;

public class AdderOverLoadMain2 {

	public static void main(String[] args) {
		AdderOverload2 ao=new AdderOverload2();
		System.out.println(ao.add(10,2));
		System.out.println(ao.add(10,20,30));
		System.out.println(ao.add(10.5,2.5));
		
	}
}