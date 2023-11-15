package com.thiru.statickeyword.method1;
/*
 2) Java static method
 ======================
	If you apply static keyword with any method, it is known as static method.
o	A static method belongs to the class rather than the object of a class.
o	A static method can be invoked without the need for creating an instance of a class.
o	A static method can access static data member and can change the value of it.

 */
public class Student {
		 int rollno;  
	     String name;  
	     static String college = "ITS";  
		 //static method to change the value of static variable  
		 static void change(){  
		     college = "BBDIT";  
		     }  
	     //constructor to initialize the variable  
		     Student(int r, String n)
		     {  
		    	 rollno = r;  
		    	 name = n;  
		     }  
		     //method to display values  
		     void display()
		     {
		    	 System.out.println(rollno+" "+name+" "+college);
			 }  
		//Test class to create and display the values of object  


	public static void main(String[] args) {
		Student.change();//calling change method  
			    //creating objects  
			    Student s1 = new Student(111,"Karan");  
			    Student s2 = new Student(222,"Aryan");  
			    Student s3 = new Student(333,"Sonoo");  
			    //calling display method  
			    s1.display();  
			    s2.display();  
			    s3.display();  


	}

}
