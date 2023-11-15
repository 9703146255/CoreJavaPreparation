package com.rks.interfaces;

public class Test implements Printable{
	@Override
	public void print() {
		System.out.println("hello thiru how are you");
		
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.print();

	}

}
