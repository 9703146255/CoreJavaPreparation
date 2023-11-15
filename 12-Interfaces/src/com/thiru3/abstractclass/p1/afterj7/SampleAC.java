package com.thiru3.abstractclass.p1.afterj7;

public abstract class SampleAC implements Laptop{
	
	
	//if we are having common implementation in between multiple classes 
	//we can keep abstract and non abstract methods
	// all the sample code should be placed here
	//its is a mediater between class and interface
	//we do not mandatory to use all features here
	public void copy()
	{
		System.out.println("Lenovo copy code");
	}
	
	public void paste()
	{
		System.out.println("Lenovo paste code");
	}
	public abstract void cut();   //in abstract class/methods must be give abstarct key word 
	public abstract void keyboard();
	
	public void printing()
	{
		System.out.println("we can write extra methods also  lenovo printing code");
	}

}
