package com.thiru.arrays1;

import java.util.Arrays;

public class No_03_MakePi {

		public static int[] makePi()
	     {
	    	 int[] piArray= {3,1,4};
			 return piArray;
	     }
	public static void main(String[] args) 
	{
		int[] piDigits=makePi();
        System.out.println(Arrays.toString(piDigits));
      //converting arrays to string
	}

}
