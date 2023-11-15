package com.thiru.methods1;
/*
 1.Create "Employee" class
      --instance fields
         name,age,salary
      --Methods
         - takeInputs
         - printData
Create a main class "Company"
        -Create employee objects
        -call methods


 */
public class Employee {
	String name;
	int age;
	double salary;
	
	void takeInputs(String l_name,int l_age,double l_salary)
	{
		name=l_name;
		age=l_age;
		salary=l_salary;
	}
	void printData()
	{
		System.out.println("name :"+name+" age :"+age+" salary :"+salary);
	}

}
