package com.thiru.statickeyword.var3;
/*
 Program of counter by static variable
As we have mentioned above, static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.
1.	//Java Program to illustrate the use of static variable which  
2.	//is shared with all objects.  

 */
public class Counter {
	static int count=0;//will get memory only once and retain its value  
	  	Counter(){  
		count++;//incrementing the value of static variable  
		System.out.println(count);  
		}  

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
		
	}

}
