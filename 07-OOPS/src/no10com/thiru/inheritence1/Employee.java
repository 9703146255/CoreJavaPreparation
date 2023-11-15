package no10com.thiru.inheritence1;

public class Employee extends CollegeMember{
	
	double salary;
	Employee(){}
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.salary);
	}

}
