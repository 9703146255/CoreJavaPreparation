package com.thiru.day7.abstractclass;




abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}

abstract class Beta extends Alpha 
{
	@Override
	public void show() //demo();
	{
		System.out.println("Show method implemented in Beta class");		
	}
}

class Gama extends Beta 
{
	@Override
	public void demo()
	{
		System.out.println("Demo method implemented in Gama class");	
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
	
		Gama g = new Gama();
		g.show(); g.demo();

	}

}
