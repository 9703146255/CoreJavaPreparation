package com.thiru.functionalinterface;

import java.util.function.Consumer;

class Person
{
	private String name;

	public String getName() 
	{
		return name;
		
	}

	public void setName(String name) 
	{	
		this.name = name;
	}
	
}

public class FIConsumer_P2 {

	public static void main(String[] args) {
		
		Person p=new Person();
		Consumer<Person> setName=s->s.setName("golla thirumalesh");
		setName.accept(p);
		System.out.println("my name is  : "+p.getName());
		

	}

}
