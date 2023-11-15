package com.thiru.javabeanclass;

import java.io.Serializable;




/*BEAN CLASS
 * =========
 * IT IS AN EXTENDED VERSION OF A POJO CLASS
 * IT IS ALSO REFERRED AS SERIALIZABLE POJO CLASS
 * 
 * 
 * 
 * NOTE:
 * 
 * 1)it should implements serializable interface
 * 2)it should have a no-args constructor
 * 3)all the properties(instance variables) should be private
 * 4)it should have getter and setter(public) in order to access the properties
 * 
 * hint:
 * implements serializable interface  -->CLASS
 * all properties have private
 * it have a no-args constructor      
 * must be getters and setters methods
 * 
 */

public class Student implements Serializable{
	
	
	
	 private int id;
	 private String name;
	 private int marks;
	 
	 Student(){}
	 //wheever creted arg-constructor there is vanished default constructor than create no-arg constructor
	 Student(int id,String name,int marks)
	 {
		 this.name=name;
		 this.id=id;
		 this.marks=marks;
	 }
	 
	 
	 
	 //getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	 
	 
	

	
	
	

}
