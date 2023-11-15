package com.thiru.interfaces;

public class User {

	public static void main(String[] args) {
		
		
		Lenovo lnv=new Lenovo();
		lnv.copy();
		lnv.paste();
		lnv.cut();
		lnv.Camera();
		lnv.keyBoard();
		// default methods we can create object and call the method 
		lnv.Security();
		//static method to call based on  class name or interface naem
		Lenovo.audio();
		
		
		Hp hp=new Hp();
		hp.copy();
		hp.paste();
		hp.cut();
		hp.keyBoard();
		hp.printing();
		
		
		Apple ap=new Apple();
		ap.copy();
		ap.paste();
		ap.cut();
		ap.keyBoard();

	}

}
