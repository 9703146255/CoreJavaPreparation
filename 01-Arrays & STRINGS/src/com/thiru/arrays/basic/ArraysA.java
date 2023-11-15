package com.thiru.arrays.basic;

public class ArraysA {

	public static void main(String[] args) {
		
/*
DECLARATION OF THE ARRAY 

String[] stringArray1;                   -->Declaration of the String Array without specifying the size
String[] stringArray2 = new String[2];  -->Declaration by specifying the size
		  
types of declaration and initioalization of array
		 
1. String[] strAr1 = new String[] {"Ani", "Sam", "Joe"}; //by using new keyword & initialize
2. String[] strAr2 = {"Ani", "Sam", " Joe"};  	//without using new kw directly initialize
3. String[] strAr3 = new String[3];  //by using new keyword & fix the size 
   strAr3[0]= "Ani";  
   strAr3[1]= "Sam";  
   strAr3[2]= "Joe";  
 */
	

		 //####1)ITERATION OF ARRAY STRING Method-1
		//----------------------------
		
		/*
		
		String[] str= {"thiru","charan","vinay","yaswin"};
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str.get(i);
		}
		*/
		
		/*
		// OR FOLLOW THIS FOR each LOOP
		
		String[] str= {"thiru","charan","vinay","yaswin"};
		for(String itr:str)
		{
			System.out.println(itr);
		}
		*/
		
		
		//1. String[] strAr1 = new String[] {"Ani", "Sam", "Joe"}; //inline initialization  
		

		
//		String[] strAr1 = new String[] {"Ani", "Sam", "Joe"};
//		
//		 for(String itr:strAr1)
//			{
//				System.out.println(itr);
//			}
			
		
		
		//2. String[] strAr2 = {"Ani", "Sam", " Joe"};  
		
		
		
//		 String[] strAr2 = {"Ani2", "Sam2", "Joe2"};
//		 for(String itr:strAr2)
//			{
//				System.out.println(itr);
//			}
//		
		
		
//		 String[] strAr3 = new String[3]; //Initialization after declaration with specific size  
//		   strAr3[0]= "Ani3";  
//		   strAr3[1]= "Sam3";  
//		   strAr3[2]= "Joe3";  
//		   for(String itr:strAr3)
//			{
//				System.out.println(itr);
//			}
		 
		 
		 String[] names1= {"thiru","charan","vinay","kushi"};
		 
		 for(String str1:names1)
		 {
			 System.out.println(str1);
		 }
		 /*
thiru
charan
vinay
kushi
		  */
		 
		 System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		 String[] names2=new String[] {"thiru","charan","vinay","kushi"};
		 for(String str2:names2)
		 {
			 System.out.println(str2);
		 }
		 
		 /*
thiru
charan
vinay
kushi
		  */
		 
		 System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		 
		 String[] names3=new String[10]; //
		 names3[0]="hari";
		 names3[1]="vinay";
		 names3[2]="chintu";
		 names3[3]="kiran";
		 
		 for(String str3:names3)
		 {
			 System.out.println(str3);
		 }
		 
		 
		 /*
hari
vinay
chintu
kiran
null[memory wasted from onword]
null
null
null
null
null
		  */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		}

}
