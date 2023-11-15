package com.thiru.pojoclass;


/*
POJO: PLAIN OLD JAVA OBJECT
===========================
ITS NOT EXTENDS OR IMPLEMENTS ANY OTHER CLASS OR INTERFACES
IT IS A INDIPENDENT CLASS
WE HAVE TO USE SETTER AND GETTER METHODS  HERE
IT IS A SIMPLE JAVA OBJECT WHICH IS NOT HAVE ANY SPECIAL RESTRICTIONS


->PLAIN OLD JAVA OBJECT

->Independent class

->Simle java object not have any restrictions

->Its not extends->classes ,not impliments->interfaces




*/	


public class Employee {
	private int id;  //by using setter getter methods we can access this private
	public String name;  //we can use directly this public var
	protected double salary; //we can use directly this protected var
	
	//NO ARG-CONSTRUCTOR
	Employee()
	{
		System.out.println("This is no args constructor");
	}
	
	//PARAMETERAISED CONSTRUCTOR TO DISTINGUISH THE LOCAL AND INSTANCE VARIABLES
	Employee(int id)
	{
		this.id=id;
	}
	
	//by using getter and setter methods ( we can set the data and get the data here)
	public void setId(int id)
	{
	this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	
     //NO ARGS- CONSTRUCTOR
	//PARAMETERAISED CONSTRUCTOR
	//SETTER AND GETTER METHODS
	
	
	

}
