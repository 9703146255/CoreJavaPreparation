package com.thiru.abc3;


//SWAPPING OF STRINGS
public class ABC1 {

	public static void main(String[] args) {
	
		
		String name1="thiru";
		String name2="ram";
		String temp="";
		System.out.println("Before name1  :"+name1);
		System.out.println("Before name2  :"+name2);
		
		
		temp=name1;
		name1=name2;
		name2=temp;
		
		System.out.println("After name1  :"+name1);
		System.out.println("After name2  :"+name2);
		

	}

}
