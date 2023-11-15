package com.thiru.day9b.interfac;

public class Main {

	public static void main(String[] args) {
		HotDrink hd;
		
		hd = new Tea(); hd.preapare(); hd.expressPrepare();
			
		hd = new Coffee(); hd.preapare();

	}

}
