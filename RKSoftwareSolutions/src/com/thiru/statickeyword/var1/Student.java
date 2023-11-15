package com.thiru.statickeyword.var1;



/*
 1) Java static variable
	If we declare any variable as static, it is known as a static variable.
==>	The static variable can be used to refer to the common property of all objects 
	(which is not unique for each object), for example,
	 the company name of employees, college name of students, etc.
==>	The static variable gets memory only once in the "class area" at the time of class loading.

Advantages of static variable
=============================
It makes your program memory efficient (i.e., it saves memory).
Understanding the problem without static variable
1.	class Student{  
2.	     int rollno;  
3.	     String name;  
4.	     String college="ITS";  
5.	}  
Suppose there are 500 students in my college, now all instance data members will get memory each time 
when the object is created. All students have its unique rollno and name, so instance data member is good in such case.
Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.
Java static property is shared to all objects.

 */


public class Student {
	int rollNo;
	String name;
	static String company="TCS";
	Student(int r,String n)
	{
		rollNo=r;
		name=n;
	}
	void display()
	{
		System.out.println(name+" : "+rollNo+" : "+company);
	}
	public static void main(String[] args) 
	{
		 Student s1 = new Student(111,"Karan");  
		 Student s2 = new Student(222,"Aryan"); 
		 s1.display();
		 s2.display();
	}

}
