package com.thiru.Repeated1;

public class R3_CountNoOfPosNegZeroesInArray {

	public static void main(String[] args) {
		
//		int[]  a= {10,20,1,2,-5,-4,-3,0,0};
//		int pos=0,neg=0,zeroes=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//				if(a[i]>0)
//				{
//					pos++;
//				}
//				else if(a[i]<0)
//				{
//					neg++;
//				}
//				else if(a[i]==0)
//				{
//					zeroes++;
//				}
//				
//		}
//		System.out.println("positive :"+pos);
//		System.out.println("negative :"+neg);
//		System.out.println("zeroes   :"+zeroes);
		
		
		
		
//		int posVal=0;
//		int negVal=0;
//		int zeroVal=0;
//		
//		int[] x=new int[] {10,20,30,40,80,99,-10,0,-22};	
//		
//		for (int i = 0; i < x.length; i++) 
//		{
//			if(x[i] > 0)
//			{
//				posVal++;
//			}
//			if(x[i] < 0)
//			{
//				negVal++;
//			}
//			if(x[i] == 0)
//			{
//				zeroVal++;
//			}
//		}
//		System.out.println(" "+posVal+" "+negVal+" "+zeroVal);
		
		
		
		int[] x=new int[] {10,20,30,40,80,99,-10,0,-22};	
		System.out.println("positive values are");
		for (int i = 0; i < x.length; i++) 
		{
			if(x[i] > 0)
			{
				System.out.println(x[i]+"  ");
			}
			
		}	
		System.out.println("negative values are");
		for (int i = 0; i < x.length; i++) 
		{
			if(x[i] < 0)
			{
				System.out.println(x[i]+"  ");
			}
			
		}	
		System.out.println("zeros values are");
		for (int i = 0; i < x.length; i++) 
		{
			if(x[i] == 0)
			{
				System.out.println(x[i]+"  ");
			}
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
