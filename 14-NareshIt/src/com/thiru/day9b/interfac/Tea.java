package com.thiru.day9b.interfac;

public class Tea implements HotDrink{

	@Override
	public void preapare() {
		System.out.println("Preparing Tea");
		
	}

	@Override
	public void expressPrepare() {
		System.out.println("Premium Tea is available");
		
	}

}
