package com.thiru.multithredding6;

public class Demo implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread is started...");
		
	}
	public static void main(String[] args) {

          Demo dm=new Demo();
          Thread t1=new Thread(dm);
          t1.start();
          //t1.start();//java.lang.IllegalThreadStateException


	}



}
