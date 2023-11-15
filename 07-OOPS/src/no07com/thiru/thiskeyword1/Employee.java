package no07com.thiru.thiskeyword1;
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
		
		//this(name, age, salary); must be stataic variables
	}
	
	//parameteraised constuctor
	Employee(String name,int age,double salary)
	{
		//to access instance variables
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	//method
	void printData()
	{
		System.out.println("name :"+this.name+" age :"+this.age+" salary :"+this.salary);
	}

}
