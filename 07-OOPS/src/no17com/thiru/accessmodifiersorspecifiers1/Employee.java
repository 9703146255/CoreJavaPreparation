package no17com.thiru.accessmodifiersorspecifiers1;
/*

same scope[protected == protected]
===================================
CollegeMember	==>	[ super class ] protected
Employee		==>	[	sub class ] protected 


increases scope[default ==> protected]
======================================
CollegeMember	==>	[ super class ] default
Employee		==>	[	sub class ] protected 


 */
public class Employee extends CollegeMember{
	
	double salary;
	Employee(){}
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	protected void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.salary);
	}

}
