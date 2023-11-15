package com.thiru.hyr;



//Write a java program count number of characters in a string
public class Hyr_02_ACountNoOfCharInString {

	public static void main(String[] args) {

		
		String name="java is super";
		name=name.concat("@");
		char[] x=name.toCharArray();
		int size=x.length;
		
		int count=0;
		int i=0;
        while(x[i] != '@')
        {
        	count ++;
        	i++;
        }
        System.out.println("number of characters in a string :"+count);
        

	}

}
