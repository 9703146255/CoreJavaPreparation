package com.thiru2.interfaces.p1.afterj7;

public class Lenovo implements Laptop{
	
	
	public void copy()
	{
		System.out.println("Copy code lenovo");
	}
	public void paste()
	{
		System.out.println("paste code in lenovo");
	}
	public void cut()
	{
		System.out.println("cut code in lenovo");
	}
    public void keyboard()
    {
    	System.out.println("keyboard coad in lenovo");
    }
    ///////////////////////////////////////// we can add extra but must be iterface impl methods present
    public void capture()
    {
    	System.out.println("capture extra added feature code in lenovo");
    }
    
    @Override
    public void security()
    {
    	System.out.println("lenovo security with default method in laptop");
    }
    
    
    
}
