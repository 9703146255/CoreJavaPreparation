package com.thiru.interfaces;
/*


public void copy();
public void paste();
public void cut();
public void keyBoard();
default Security();
static audio();
private commonCode();


*/
public class Lenovo implements Laptop{

	@Override
	public void copy() {
		System.out.println("Lenovo copy method");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste method");
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut method");
		
	}

	@Override
	public void keyBoard() {
		System.out.println("Lenovo keyBoard method");
		
	}
	////////////////////////////////////////newly added feature
	public void Camera() {
		System.out.println("Lenovo Camera method");
		
	}
	
	//DEFAULT METHOD OVERRIDING HERE //////////////////////
	public void Security()
	{
		System.out.println("Security added in lenovo");
		commonCode();

	}
	
	//STATIC METHOD OVERRIDING HERE
	public  static void audio()
	{
		System.out.println("audio added in lenovo");
		commonCode();
		
	}
	
	private static void  commonCode()
	{
		System.out.println("common code");
	}
	

}
