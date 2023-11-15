package com.thiru.multithredding5;

//Java program to start mutliple threads to perform same activity


public class Demo implements Runnable{

	@Override
	public void run() {
		
		System.out.println("run () method started..." + Thread.currentThread().getName());
		try {
			Thread.sleep(15000); // blocked state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run () method ended..." + Thread.currentThread().getName());
	}
	
	
	
	
	public static void main(String[] args) {
		Demo d = new Demo();

		Thread t1 = new Thread(d);
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t1.setName("Thread-1");

		Thread t2 = new Thread(d);
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t2.setName("Thread-2");

		Thread t3 = new Thread(d);
		t3.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setName("Thread-3");

		t1.start(); // runnable state
		t2.start(); // runnable state
		t3.start(); // runnable state

	}



}
