package com.thiru.justcode;

public class LinearSearch {

	public static void main(String[] args) {

     int[] array= {10,20,30,40,50,30};
     int search_ele=5;
    
     
     for (int i = 0; i < array.length; i++) 
     {
    	 if(search_ele==array[i]);
    	{
    	System.out.println("element found");
    	break;
    	}
     }
     }

}
