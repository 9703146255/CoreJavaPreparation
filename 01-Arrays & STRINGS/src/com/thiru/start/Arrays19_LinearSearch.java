package com.thiru.start;

public class Arrays19_LinearSearch {

	public static void main(String[] args) {

     int[] array= {10,20,30,40,50,30,5,5};
     int search_ele=10;
     int count=0;
     int len=array.length;
    
     for(int i=0;i<len;i++)
     {
    	 if(search_ele==array[i])
    	 {
    		 count++;
    	 }
     }
     
     if(count != 0)
     {
    	 System.out.println("element is present "+count+" times");
     }
     else
     {
    	 System.out.println("element is not present");
     }
     
     
     
     
    }

}
