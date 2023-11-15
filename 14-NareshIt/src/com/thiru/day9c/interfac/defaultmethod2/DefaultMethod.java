package com.thiru.day9c.interfac.defaultmethod2;

public class DefaultMethod {

	public static void main(String[] args) {
		HotDrink hk;
		hk = new Tea(); hk.prepare(); hk.expressPrepare();		
		hk = new Coffee(); hk.prepare(); 

	}

}
