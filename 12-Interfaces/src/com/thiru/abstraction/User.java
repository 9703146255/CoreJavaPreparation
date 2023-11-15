package com.thiru.abstraction;

import java.util.Hashtable;

public class User {

	public static void main(String[] args) {
		
		
		//Lenovo lnv=new Lenovo();  //SELECT COPY AND FN+F3 --> IMPLEMENTED METHOD WE WILL GET
		Laptop lnv=new Lenovo();  //SELECT COPY AND FN+F3 --> un-IMPLEMENTED METHOD WE WILL GET
		lnv.copy();              //HIDING THE IMPLEMENTATION ANS SHOWING THE FUNCTIONALITY
		lnv.paste();
		lnv.cut();
		
		//we cannot create object for ABSTRACT CLASSES
		//SampleAC ab=new SampleAC();
		
		
		

	}

}


