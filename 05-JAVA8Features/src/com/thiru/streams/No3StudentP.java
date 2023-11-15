package com.thiru.streams;

import java.util.Arrays;
import java.util.List;

class Student1
{
	
	
	
	private String name;
	private int marks;
	
	Student1(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
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











public class No3StudentP {

	public static void main(String[] args) {
		List<Student1> list=
				Arrays.asList(new Student1("kiran",55),
						new Student1("kiran",66),
						new Student1("charan",56),
						new Student1("vinay",58),
						new Student1("chathurved",25),
						new Student1("manasa",78),
						new Student1("vani",77),
						new Student1("chandan",99)
				);
		
		list.stream().filter(s->s.getMarks()>60).forEach(ss->System.out.println(ss.getName()+">>>>>>>>>>>>>>"+ss.getMarks()));
				
				

	}

}
