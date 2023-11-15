package com.thiru3.abstractclass.p1.afterj7;
/*
Business interface implemeted  methods must be present in implemented classes 
then only add extra features in iml classes
 */
public interface Laptop {
	
	
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	//if we add default method not effect to other laptops
	//if we add abstract method all are effecting
	default void security()
	{
		System.out.println("please use this featur with override");
	    
		//audio(); we can call static mtd inside nnstk
		commonCode();
	
	}
	
     static void audio()
     {
    	 //we can't call non stk method in static mtd
    	// security();
    	 
    	 System.out.println("please use this static metd with class name");
    	 commonCode();
     }
     
   
	private static void commonCode()  //we can create static also
     {
    	 
    	 System.out.println("common code private method");
    
     }
}
