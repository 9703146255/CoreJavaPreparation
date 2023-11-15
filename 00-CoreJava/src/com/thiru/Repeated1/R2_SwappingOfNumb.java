package com.thiru.Repeated1;



/*

 	temp=a;         
  	a=b;
  	b=temp;
 ==================
  	a=a+b;			
  	b=a-b;
  	a=a-b;
 =================
  	a=a*b;			
  	b=a/b;
  	a=a/b;
=================
 	a=a^b;
 	b=a^b;
 	a=a^b;
=================
	b=a-b+(a=b);
=================

  
 */
public class R2_SwappingOfNumb {

	public static void main(String[] args) {
		// logic-1
		
//	  int a=10,b=20,temp;
	  
	  //Logic-1 with using third variable
	  
//	  System.out.println("Before swap :"+a+" : "+b);
//	  temp=a;         //temp=10,a=20==> b=10,a=20
//	  a=b;
//	  b=temp;
//	  System.out.println("After swap :"+a+" : "+b);
	  
	  //Logic-2 without using third variable
	  
//	  System.out.println("Before swap :"+a+" : "+b);
//	  a=a+b;			//a=30,b=-10,a=20==>a=20,b=10
//	  b=a-b;
//	  a=a-b;
//	  System.out.println("After swap :"+a+" : "+b);
	  
	
	  
	  //Logic-3 without using third variable
	  
//	  System.out.println("Before swap :"+a+" : "+b);
//	  a=a*b;			//a=200,b=10,a=20==>a=20,b=10
//	  b=a/b;
//	  a=a/b;
//	  System.out.println("After swap :"+a+" : "+b);
	  
	  //Logic-4 without using third variable
	   
//	  System.out.println("Before swap :"+a+" : "+b);
//	  a=a^b;
//	  b=a^b;
//	  a=a^b;
//	  System.out.println("After swap :"+a+" : "+b);
	  
	  //Logic-5 with single line
	  
//	  System.out.println("Before swap :"+a+" : "+b);
//	  b=a+b-(a=b);
//	  System.out.println("After swap :"+a+" : "+b);
	  
	  
//	  //method-1
//	  int a=10, b=20, temp;
//	  System.out.println("Before swapping numbers  : "+a +" "+b);
//	  temp = a;
//	  a = b;
//	  b = temp;
//	  System.out.println("After swapping numbers  : "+a +" "+b);
		
		
		  //method-2
//		  int a=10, b=20, temp;
//		  System.out.println("Before swapping numbers  : "+a +" "+b);
//		  a = a*b;
//		  b = a/b;
//		  a = a/b;
//		  System.out.println("Before swapping numbers  : "+a +" "+b);
		  
	  
		  //method-3
//		 int a=10, b=20, temp;
//		 System.out.println(a+" "+b);
//		 a=a+b;
//		 b=a-b;
//		 a=a-b;
//		 System.out.println(a+" "+b);
	  
	  
	  //method-4
		
//		 int a=10, b=20;
//		 System.out.println(a+" "+b);
//		 b=a-b+(a=b);
//		 System.out.println(a+" "+b);
		
		
		 int a=10, b=20;
		 
		 System.out.println(a+" "+b);
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println(a+" "+b);
				 
		 
		 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
