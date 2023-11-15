package com.thiru.justcode;


//First non-repeated character in a given string
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

//     String name="Madam";
//     //String name="Apple";
//     name=name.toUpperCase();
//     char[] x=name.toCharArray();
//     int len=x.length;
//     for(int i=0;i<len;i++)
//     {
//    	boolean unique=true;
//    	for(int j=0;j<len;j++)
//    	{
//    		if(i != j && x[i]==x[j])
//    		{
//    			unique=false;
//    		}
//    	}
//    	if(unique)
//    	{
//    		System.out.println(x[i]);
//    		break;
//    	}
//     }
//     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s="Apples";
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		int len=a.length;
		
		for(int i=0;i<len;i++)
		{
			boolean unique=true;
			
			for(int j=0;j<len;j++)
			{
				if(i != j && a[i]==a[j])
				{
					unique=false;
				}
					
			}
			
			if(unique)
			{
//				System.out.println(a[i]);
//				break;  //if not used break then remaining repeated letters are printed
				
				//for last non repeated character
				for( i=len-1;i>0;i--)
				{
					System.out.println(a[i]);
					break;
				}
				
				
			}
			
		}
					
		
		

	}

}
