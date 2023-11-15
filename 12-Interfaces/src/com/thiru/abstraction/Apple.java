package com.thiru.abstraction;

public class Apple implements Laptop{

	@Override
	public void copy() 
	{System.out.println("Apple copy method");

		
	}

	@Override
	public void paste() {
		System.out.println("Apple paste method");
		
	}

	@Override
	public void cut() {
		System.out.println("Apple cut method");
		
	}

	@Override
	public void keyBoard() {
		System.out.println("Apple keyBoard method");
		
	}

}
