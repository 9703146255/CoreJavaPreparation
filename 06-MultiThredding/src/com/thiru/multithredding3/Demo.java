package com.thiru.multithredding3;

//Java program to create the thread using Runnable interface
public class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("run() method is called...");
		
	}
	
	
	
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();

	}



}
