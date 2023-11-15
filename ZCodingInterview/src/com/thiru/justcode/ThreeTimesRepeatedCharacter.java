package com.thiru.justcode;
//3 times repeated character in a given string
public class ThreeTimesRepeatedCharacter {

	public static void main(String[] args) {
		
		 String s="animalamlmm";
         char[] x=s.toCharArray();
         int len=x.length;
         for(int i=0; i<len;i++)
         {
         	int count=0;
         	
         	 for(int j=0; j<len;j++)
              {
                 if(x[i]==x[j])
                 {
                 	count++;
                 }
              }
         	 //1 time,2 time,3 time,4 time,5 time......repeated characters
         	 if(count==3)
         	 {
         		 System.out.println(x[i]);
         		 break;
         		
         	 }
         }

	}

}
