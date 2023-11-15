package com.thiru.interfaces;

public interface Laptop {
	
	//what to do
	//WAHT IS INTERFACE IN JAVA
	//==================
	//interface is a blue print of a class
	//unimplement methods or business logic or  BEFORE 1.8
	
	
	
	//ABSTRACT METHODS OR UNIMPLEMENTED MEHODS before 1.8
	public void copy();
	public void paste();
	public void cut();
	public void keyBoard();
	
	
	// we can override this methods in lenovo /hp /apple classes
	// i can override  in lenovo see that
	
	
	//default and static methods released 1.8  or 8 features
	// we can override this methods into classes
	default void Security()
	{
		System.out.println("please implement this method");
		commonCode();
	}
	public  static void audio()
	{
		System.out.println("audio");
		commonCode();
		
	}
	

	
	//java 1.9 feature is-->  private static
	// i want to use common code in both default,static Methods its was released

	
	//PRIVATE STATIC --> 1.9 FEATURES
	private static void commonCode()
	{
		System.out.println("this is the common code");
	}
	
	
	

}
