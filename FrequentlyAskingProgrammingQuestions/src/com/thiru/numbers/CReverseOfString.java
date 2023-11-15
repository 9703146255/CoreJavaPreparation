package com.thiru.numbers;

public class CReverseOfString {

	public static void main(String[] args) {

         String s="ABCD";
         char[] x=s.toCharArray();
         int size=x.length;
         System.out.println("Ascending order :");
         for(int i=0;i<size;i++)
         {
        	 System.out.println(x[i]);
         }
         
         
         
         System.out.println("Descending order :");
         for(int i=size-1;i>=0;i--)
         {
        	 System.out.println(x[i]);
         }
         
         
         
         System.out.println("second method is :");
         String str="THIRU";
         String rev="";
         int len=str.length();
         for(int i=len-1;i>=0;i--)
         {
        	 rev=rev+str.charAt(i);
        	
         }
         System.out.println(rev);
         
         
         System.out.println("third method is :");
         String str1="RAM";
         String rev1="";
         char[] x1=str1.toCharArray();
         int len1=x1.length;
         for(int i=len1-1;i>=0;i--)
         {
        	 rev1=rev1+x1[i];
        	
         }
         System.out.println(rev1);
         
         
         System.out.println("four by using string buffer method is :");
         
         
          String st="FOURTH";
          StringBuffer sbr=new StringBuffer();
          sbr.append(st); 
          System.out.println(sbr.reverse());
          
          System.out.println("fifth by using stringBuilder method is :");
          String st1="FIFTH";
          StringBuilder sbr1=new StringBuilder();
          sbr1.append(st1);
          System.out.println(sbr1.reverse());
          
	
	
	}

}
