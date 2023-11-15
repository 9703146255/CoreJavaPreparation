package com.thiru.multithredding1;

public class Demo2 {
	
	public static void main(String[] args) {
		Thread currentThread=Thread.currentThread();
		System.out.println(currentThread);
		System.out.println(currentThread.getName()); 
		System.out.println(currentThread.getPriority());
		System.out.println(currentThread.getThreadGroup());
		System.out.println(currentThread.getClass());
	}

}
