package com.thiru.incedo;

public class PrintUniqueCharAndCount {

	public static void main(String[] args) {
		//remove duplicates and count the values in the string
		  String msg="madam";
		  char[] c=msg.toCharArray();
		  int len=c.length;
		  
		  for(int i=0;i<len;i++)
		  {
			  int count=0;
			  boolean unique=false;
			  for(int j=i+1;j<len;j++)
			  {
				  if(c[i]!=c[j])
				  {
					  unique=true;
					  
				  }
			  }
			  
			  if(unique)
			  {
				  System.out.println(c[i]);
				 
			  }
		  }
		  
		  
//		  //duplicate characters in a given string
//		  for(int i=0;i<len;i++)
//		  {
//			  for(int j=i+1;j<len;j++)
//			  {
//				  if(c[i]==c[j])
//				  {
//					 System.out.println(c[i]);
//				  }
//			  }
//			  
//		}  
//		  
		  
		  

	}

}
