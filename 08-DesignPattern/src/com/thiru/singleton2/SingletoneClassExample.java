package com.thiru.singleton2;


/*
 * 3 type of design patterns is there 
 * ==================================
 * 1)Behavioral
 * 2)Structural
 * 3)Creational
 * 4)J2EE
 * 5)MICROSERVICES
 * 
 * FIRST 1,2,3 ==> Having 23 design patterns {singletone is one of that}
 Singleton:
 =========
 Which is having only one object through out the project
 we should not allow to create more than one object
 Design patterns are not belongs to only java it will belongs to all the languages
 like java, python, dotnet...
 */

final public class SingletoneClassExample {
	//A
	//B extends A
	//A a=new B();
	//why we are making class as final in singletone:
	//if we don't make class as final than we can inherit that and we can create object for that class
	
	
	
	
	

	//class loader:whenever class is loaded at the time only object will be creared otherwise its not created
	//static SingletoneClassExample s=new SingletoneClassExample(); //eager initiolaisation
	private static SingletoneClassExample instance=null;//lazy initiolisation////
	
	private SingletoneClassExample()
	{
		System.out.println("in private constructor");
	}
	
	
	public static SingletoneClassExample getInstance()
	{
		
		if(instance==null)
		{
			instance= new SingletoneClassExample();
		}
		 return instance; ////it will create object first time only //so only one time will be created
	}
}
