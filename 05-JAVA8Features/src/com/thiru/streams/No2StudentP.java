package com.thiru.streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Student
{
	private String name;
	private int marks;
	
	
	

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	
}





public class No2StudentP {
	
	public static void main(String[] args) {
		
	  List<Student> list=Arrays.asList(
			  new Student("thiru",83),
			  new Student("guru",77),
			  new Student("chiru",66),
			  new Student("charan",55),
			  new Student("vianay",22));
		
		
		list.stream().filter(s->s.getMarks()>50).forEach(ss->System.out.println(ss.getName()+">>>>>>>>>>>>>>"+ss.getMarks()));
	}

}
