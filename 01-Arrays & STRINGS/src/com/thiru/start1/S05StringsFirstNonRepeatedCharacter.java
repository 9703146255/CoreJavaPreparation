package com.thiru.start1;


//First non-repeated character in a given string
public class S05StringsFirstNonRepeatedCharacter {

	public static void main(String[] args) {

	//print first non-repeated character
		//
//	     String name="Applea";
//	     //String name="Apple";
//	     name=name.toUpperCase();
//	     char[] x=name.toCharArray();
//	     int len=x.length;
//	     for(int i=0;i<len;i++)
//	     {
//	    	boolean unique=true;
//	    	for(int j=0;j<len;j++)
//	    	{
//	    		if(i != j && x[i]==x[j])
//	    		{
//	    			unique=false;
//	    		}
//	    	}
//	    	if(unique)
//	    	{
//	    		System.out.println(x[i]);
//	    		   break;                   //if remove break print all non-repeated characters
//	    	}
//	     }	
		
		
		

		
		
		String name="Applea";
		name=name.toLowerCase();
		char[] x=name.toCharArray();
		
		for (int i = 0; i < x.length; i++) 
		{
			boolean unique=true;
			for (int j = 0; j < x.length; j++) 
			{
				if(i != j && x[i] == x[j])
				{
					unique=false;
				}
			}
			
			if(unique)
			{
				System.out.println(x[i]);
				
			}
		}

		


		
		
		
		
		
		
		
		
		
		
		
		
		

		

		

		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s="Apples";
//		s=s.toLowerCase();
//		char[] a=s.toCharArray();
//		int len=a.length;
//		
//		for(int i=0;i<len;i++)
//		{
//			boolean unique=true;
//			
//			for(int j=0;j<len;j++)
//			{
//				if(i != j && a[i]==a[j])
//				{
//					unique=false;
//				}
//					
//			}
//			
//			if(unique)
//			{
////				System.out.println(a[i]);
////				break;  //if not used break then remaining repeated letters are printed
//				
//				//for last non repeated character
//				for( i=len-1;i>0;i--)
//				{
//					System.out.println(a[i]);
//					break;
//				}
//				
//				
//			}
//			
//		}
					
		
		

	}

}
