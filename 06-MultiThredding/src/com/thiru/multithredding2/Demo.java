package com.thiru.multithredding2;


// Java program to create user defined thread using Thread class

public class Demo extends Thread{
	
	public void run()
	{
		System.out.println("run() method id called");
	}
	
	

	public static void main(String[] args) {
		
		 Demo dm=new Demo();
		 Thread t=new Thread(dm);
		 t.start();
		
		

	}

}
