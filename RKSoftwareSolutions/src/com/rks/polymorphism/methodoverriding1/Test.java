package com.rks.polymorphism.methodoverriding1;

public class Test {

	public static void main(String[] args) {
		SBI4 sbi=new SBI4();
		System.out.println("SBI RI:"+sbi.getRateOfInterest());
		
		ICICI3 icici=new ICICI3();
		System.out.println("ICICI RI:"+icici.getRateOfInterest());

		AXIS2 A=new AXIS2();
		System.out.println("AXIS RI:"+A.getRateOfInterest());		
		
	}

}
