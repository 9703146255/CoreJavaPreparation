package com.thiru.singleton;


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

public class SingletoneClassExample {

	//class loader:whenever class is loaded at the time only object will be creared otherwise its not created
	static SingletoneClassExample s=new SingletoneClassExample(); //eager initiolaisation
	
	
	private SingletoneClassExample()
	{
		
	}
	
	static SingletoneClassExample getInstance()
	{
		return s;
	}
}
