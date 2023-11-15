package no20com.thiru.superkeyword1;

/*
Home work questions
1)CollegeMember(super)==>name,id
    Student(sub)
    Employee(sub)
College(main class)



same scope[protected == protected]
===================================
CollegeMember	==>	[ super class ] protected
Employee		==>	[	sub class ] protected 


increases scope[default ==> protected]
======================================
CollegeMember	==>	[ super class ] default
Employee		==>	[	sub class ] protected 





 */




public class CollegeMember {
	
	String name;
	int id;
	CollegeMember(){}
	
	CollegeMember(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	protected void printData()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}
	
	

}
