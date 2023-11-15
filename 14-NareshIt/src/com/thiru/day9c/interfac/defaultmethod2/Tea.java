package com.thiru.day9c.interfac.defaultmethod2;

public class Tea implements HotDrink{
	
	@Override
	public void prepare()
	{
		System.out.println("Preparing Tea");
	}

	@Override
	public void expressPrepare()  //public is compulsory here
	{
        System.out.println("Preparing premium Tea");
	}
}


