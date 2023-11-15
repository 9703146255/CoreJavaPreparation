package com.thiru.hyr;

import java.util.Scanner;

//ReverseS

public class Hyr_05_CTotalNumberOfOccurencesOfGivenChar {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter the input string :");
//		String input=sc.nextLine();
//		
//		System.out.println("Please enter the target character :");
//		char targetChar=sc.next().charAt(0);
//		
//	   	input=input.toLowerCase();
//	      char[] x=input.toCharArray();
//	      int count=0;
//	      
//	      for (int i = 0; i < x.length; i++)
//	      {
//	    	  
//	    	   if(x[i]==targetChar)
//	    	   {
//	    		  count++;
//	    	   }
//		  }
//	      System.out.println("output is :"+count);	
		
		
		char searchChar='h';
		String name="thirumalesh how are you ttt";
		char[] x=name.toCharArray();
		int len=name.length();
		int count=0;
		for(int i=0;i < len;i++)
		{
			if(x[i]==searchChar)
			{
				count++;
			}
		}
		System.out.println("the number of time characters occures is :"+count);
		
	
	}

}
