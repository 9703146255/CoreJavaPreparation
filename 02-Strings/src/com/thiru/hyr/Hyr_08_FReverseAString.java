package com.thiru.hyr;

import java.util.Scanner;

public class Hyr_08_FReverseAString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the input string :");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		
		
		String outputString="";
		//words iterating here one by one
		for(int i=0;i<words.length;i++)
		{
		   String word=words[i];
		   String revString="";
		   //reversing of words based on characters
		   for(int j=word.length()-1;j>=0;j--)
		   {
			   revString=revString+word.charAt(j);
		   }
		   outputString+=revString+" ";
		}
		System.out.println(outputString);

	}
	
}
