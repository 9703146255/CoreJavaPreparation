package com.thiru.start1;

public class S08StringsLinearSearch {

	public static void main(String[] args) {

     int[] a= {10,20,30,40,50,30,10,10};
     int len=a.length;
     int search_ele=10;
     int count=0;
    
     
     for (int i = 0; i < len; i++) 
     {
    	 if(search_ele==a[i])
    	 	{
    	 		count++;
    	 	}
     }
     
	
	if(count!=0)
	{
		System.out.println("element fount :"+count+" times "+search_ele);
	}
	else
	{
		System.out.println("element not found");
	}

}}
