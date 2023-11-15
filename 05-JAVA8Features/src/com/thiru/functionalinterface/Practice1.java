package com.thiru.functionalinterface;

import java.util.function.Consumer;

class Man
{
	private String name;

	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	

}


public class Practice1 {
	
	public static void main(String[] args) 
	{
		Man man=new Man();
		Consumer<Man> con=s->s.setName("THIRUMALA THIRUPATHI");;
		con.accept(man);
		System.out.println(man.getName());

	}
}
