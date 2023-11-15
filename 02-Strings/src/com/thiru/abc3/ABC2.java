package com.thiru.abc3;


//SWAPPING OF STRINGS
public class ABC2 {

	public static void main(String[] args) {
	
		
		String name1="thiru";	
		String name2="ram";
		System.out.println("Before name1  :"+name1);
		System.out.println("Before name2  :"+name2);
		
	    name1=name1+name2;
	    name2=name1.substring(0,name1.length()-name2.length());
	    name1=name1.substring(name2.length());
		
		System.out.println("After name1  :"+name1);
		System.out.println("After name2  :"+name2);
		

	}

}
