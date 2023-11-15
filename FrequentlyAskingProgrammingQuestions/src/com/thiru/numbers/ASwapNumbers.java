package com.thiru.numbers;


/*
METHOD-1
========
 temp=a;
 a=b;
 b=temp;
 
METHOD-2
========
a=a+b
a=a-b
b=a-b

METHOD-3
========
a=a*b;
b=a/b;
a=a/b;

METHOD-4
========
a=a^b;
b=a^b;
a=a^b;

METHOD-5
========

a=a+b-(a=b)



  
  
 */





public class ASwapNumbers {
	
	

	public static void main(String[] args) {
	
		
		int a=10,b=20,temp;
		
//		//METHOD-1
//		System.out.println("Before swapping of numbers a : "+a+" and b is "+ b);
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping of numbers a : "+a+" and b is "+ b);
		
		
		//METHOD-2
//		System.out.println("Before swapping of numbers a : "+a+" and b is "+ b);
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping of numbers a : "+a+" and b is "+ b);
		
		
		
		//METHOD-3
//		System.out.println("Before swapping of numbers a : "+a+" and b is "+ b);
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After swapping of numbers a : "+a+" and b is "+ b);	
		
		
		//METHOD-4
//		System.out.println("Before swapping of numbers a : "+a+" and b is "+ b);
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println("After swapping of numbers a : "+a+" and b is "+ b);
		
		
		//METHOD-5
		System.out.println("Before swapping of numbers a : "+a+" and b is "+ b);
	    b=a+b-(a=b);
		System.out.println("After swapping of numbers a : "+a+" and b is "+ b);
		
		
		

	}

}
