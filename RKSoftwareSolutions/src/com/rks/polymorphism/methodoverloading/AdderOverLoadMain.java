package com.rks.polymorphism.methodoverloading;

public class AdderOverLoadMain {

	public static void main(String[] args) {
		AdderOverload ao=new AdderOverload();
		System.out.println(ao.add(10,2));
		System.out.println(ao.add(10,20,30));
		System.out.println(ao.add(10,2));
		
		
	}
}