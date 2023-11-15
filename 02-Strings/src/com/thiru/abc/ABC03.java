package com.thiru.abc;


/*
 STRINGS: COLLECION OF SEQUENTIAL CHARACTERS CALLED AS STRINGS
 IN JAVA STRINGS TREATS AS AN OBJECT
 IMMUTABLE IN NATURE
 


IN C language
==============
we can access the data directly
no '\0' at the end

TWO CHALLANGES
===============
NO direct  access the data directly
NO '\0' at the end

charAt() method
===============
if we want to retrieve single character data we can use -->charAt(number(0 to n))  method

length() method
===============
if we want to calculate the length of the string-->var.length()

without using inbuilt method to calculate the length of the string
==================================================================

 
 */


public class ABC03 {

	public static void main(String[] args) {

          String x="abc tech";
          //@ added ending of the string
          System.out.println(x);
          x=x.concat("@");
          System.out.println(x);
          //we can convert string into character array
          char[] y=x.toCharArray();
          int count =0;
          int i=0;
          //it will flow until end of the array last @==@ exit
          
                   
          while(y[i] != '@')
          {
        	  count++;
        	  
        	  i++;
          }
          
          
        System.out.println("length of the string is :"+count);
	}

}
