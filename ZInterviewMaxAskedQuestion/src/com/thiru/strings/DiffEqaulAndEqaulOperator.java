package com.thiru.strings;


/*
  ==   		==>It is used to compare the addresses/References
  equals	==>It is used to compare the Content
 */




public class DiffEqaulAndEqaulOperator {

	public static void main(String[] args) {
		
		String s1=new String("thiru");
		String s2=new String("thiru");
		
		System.out.println("Compares the content :"+s1.equals(s2));
		System.out.println("Compares the Address :"+s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		

	}

}
