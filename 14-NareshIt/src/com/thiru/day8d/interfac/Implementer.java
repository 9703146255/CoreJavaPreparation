package com.thiru.day8d.interfac;

public class Implementer implements I1,I2 {
	
	@Override
	public void sum(int x, int y) 
	{
		int z = x + y;
		System.out.println("The Sum is :"+z);
		
	}

}
