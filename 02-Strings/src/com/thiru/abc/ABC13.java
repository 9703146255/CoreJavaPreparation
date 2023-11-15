package com.thiru.abc;


/*
remove duplicate and single time only no need to print duplicates here
*/

public class ABC13 {

	public static void main(String[] args) {
		//reversing of each word 
		
		String str="hello guru how are you";
		String[] names = str.split(" ");
		String outResult="";
		for(String name:names)
		{
			String revString = "";
			
			for (int i = name.length()-1; i >=0 ; i--) 
			{
				revString=revString+name.charAt(i);
			}
			outResult=outResult+revString+" ";
		}
		
		
		System.out.println(outResult);
		
	}

}
