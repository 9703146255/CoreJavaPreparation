package com.thiru.exe;

public class ThreeRepeatedChar {
	//3 times repeated character in a given string[1 time or 2 times or 3 times repeated characters

	public static void main(String[] args) {

		
            String s="animalamlmmlkk";
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
//            	 if(count==1)
//            	 {
//            		 System.out.println("1 time :"+x[i]);
//            		
//            	 }
//            	 if(count==2)
//            	 {
//            		 System.out.println("2 times :"+x[i]);
//            	 }
            	 
            	 if(count==3)
            	 {
            		 System.out.println("3 times :"+x[i]);
            	 }
             }
            
            
            
	}

}
