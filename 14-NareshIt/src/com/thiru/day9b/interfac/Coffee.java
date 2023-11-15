package com.thiru.day9b.interfac;

public class Coffee implements HotDrink{

	@Override
	public void preapare() {
		System.out.println("Preparing Coffee");
		
	}

	@Override
	public void expressPrepare() {
		System.out.println("No implementation becoz coffee does not have premium version");	
		
	}

}
