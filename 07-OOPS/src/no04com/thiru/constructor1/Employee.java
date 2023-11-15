package no04com.thiru.constructor1;
/*
 1.Create "Employee" class
      --instance fields
         name,age,salary
      --Methods
         -takeInputs
         -printData
Create a main class "Company"
        -Create employee objects
        -call methods


 */
public class Employee {
	String name;
	int age;
	double salary;
	
	
	//no-args constructor
	Employee(){
		//this("thiru",25,2500.00);
	}
	
	//parameteraised constuctor
	Employee(String l_name,int l_age,double l_salary)
	{
	this(); //to call the no-arg constructor
		name=l_name;
		age=l_age;
		salary=l_salary;
	}
	//method
	void printData()
	{
		System.out.println("name :"+name+" age :"+age+" salary :"+salary);
	}

}
