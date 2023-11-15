package com.thiru.javabeanclass;

import com.thiru.pojoclass.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		// we are callign here default constructor
		Student s1=new Student(100,"thiru",99);   //we created object for --> NO-ARGS CONSTRUCTOR
		Student s2=new Student(100,"thiru",99);
		Student s3=new Student(100,"thiru",99);
		
	
		
		System.out.println(s1.getId());  //getting -->private value
		System.out.println(s1.getName());   //getting -->private value
		System.out.println(s1.getMarks());  //getting --> private value
		System.out.println();
		
		System.out.println(s2.getId());  //getting -->private value
		System.out.println(s2.getName());   //getting -->private value
		System.out.println(s2.getMarks());  //getting --> private value
		System.out.println();
		
		System.out.println(s3.getId());  //getting -->private value
		System.out.println(s3.getName());   //getting -->private value
		System.out.println(s3.getMarks());  //getting --> private value
		System.out.println();

		
		Student[] employees=new Student[] {s1,s2,s3};
		for(Student emp:employees)
		{
		
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getMarks());
			
		}
		
	
		
		

	}

}
