package no13com.thiru.methodoverriding1;


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



public class Student extends CollegeMember{
	
	double marks;
	
	Student(){}
	Student(String name,int id, double marks){
		
		this.name=name;
		this.id=id;
		this.marks=marks;
   }
	public	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.marks);
	}

}
