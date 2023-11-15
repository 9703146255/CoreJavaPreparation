package com.thiru.abc;


/*
 STRINGS: COLLECION OF SEQUENTIAL CHARACTERS CALLED AS STRINGS
 IN JAVA STRINGS "TREATS AS AN OBJECT"
 IMMUTABLE IN NATURE
 


IN C language
==============
we can access the data directly
no '\0' at the end

TWO CHALLANGES
===============
NO access the data directly
NO '\0' at the end

charAt() method
===============
if we want to retrieve single character data, 
we can use -->charAt(number(0 to n))  method

length() method
===============
if we want to calculate the length of the string-->var.length()
 
 */


public class ABC02 {

	public static void main(String[] args) {

     //     String x="abc tech";
//          x=x.concat("@");
//          char[] y=x.toCharArray();
////          System.out.println(x.length());
//          
//          int i=0;
//          while(y[i] != '@')
//          {
//        	  i++;
//          }
//          System.out.println(i);
          
          

       
		

		
		
		String name="thirumalesh";
		int len=name.length();
		name=name.concat("@");
		char[] x=name.toCharArray();
		int i=0;
		int count=0;
		while(len != i)
		{
			count++;
			
			i++;
		}
		System.out.println("befor length :"+len);
		System.out.println("after length :"+count);
		
		
        
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
   
	}

}
