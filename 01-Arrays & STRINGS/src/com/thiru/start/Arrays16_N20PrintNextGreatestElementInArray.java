
package com.thiru.start;

/*
{10,11,5,4,7}

10	11
11	-1
5	7
4	7
7	-1
 
 Next =-1
 i=0,j=i+1; if(arr[i]<arr[j] next=11
 10	11
 i=1, j=2;	i=1,j=3;	i=1,j=3;	i=1,j=4; 11<7 next =-1
 
 
 
 */





public class Arrays16_N20PrintNextGreatestElementInArray {

//	public static void main(String[] args) {
//		
//		
//		int[] arr= {10,11,5,4,7};
//		
//		printNextGeneratedElement(arr);
//		
//		}
//	
//	
//	private static void printNextGeneratedElement(int[] arr)
//	{
//		int next,i,j;
//		
//		for( i=0;i<arr.length;i++)
//		{
//			// next=100;
//			next=-1;
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					next=arr[j];
//					break;
//				}
//			}
//			System.out.println(arr[i]+"  "+next);
///		}
//		
//	}
	
	
	
	//print next greatest number in the array
	public static void main(String[] args) {
		int[] arr= {10,11,5,4,7};
		int len=arr.length;
		int i,j,next;
		
		
		for( i=0;i<len;i++)
		{
			next=-1;
			for( j=i+1;j<len;j++)
			{
			      if(arr[i]<arr[j])	
			      {
			    	  next=arr[j];
			    	  break;
			      }
			}
			System.out.println(arr[i]  +" , "+ next);
		}
		
	}
	
	
	
	
	
	
	
	

}
