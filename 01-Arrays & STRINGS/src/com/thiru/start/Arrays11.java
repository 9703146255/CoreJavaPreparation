package com.thiru.start;

/*

1)Find the duplicate value in the array
intput = 2,3,4,5,8,5,4,7
 */

public class Arrays11 {

	public static void main(String[] args) {
		
//		int[] a= {10,20,50,80,40,20,20,10,10};
//		int size=a.length;
//		
//		System.out.println("Duplicate values in the array is :");
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//			  if(a[i]==a[j])
//			  {
//				  System.out.println(a[i]);
//				  //System.out.println(a[i]+ " "+a[j]);
//			  }
//			}
//		}
		
		
		/*
		 * 10 compares=>20,50,80,40,20,20,10,10
		 * 20 compares=>10,20,50,80,40,20,20,10,10
		 * 50 compares=>10,20,50,80,40,20,20,10,10
		 * ...............................etc
		 * 
		 * 
		 */
		
		//duplicate elements
		int[] a= {10,20,50,80,40,20,20,10,10};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
