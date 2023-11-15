package com.thiru.start1;

//FindFirstNumberOccureEvenNumberOfTimes int[] arr= {1,2,1,2,4,5,6,6,5,4,2,4,2,4,1,1,5};
public class S06StringsFindFirstNumberOccureOddNumberOfTimes {
	public static void main(String[] args) {
		
		int[] arr= {1,2,5,6,6,5,4,2,4,2,4,1,1,5};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			//we will get duplicate  values
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++; //comes all duplicate values
				}
			}
			
			//performaing action here 
			//even or odd what u want
			if(count%2==0)
			{
				System.out.println(arr[i]);
				
			
			}
		}
		
		
//		//firs odd number of times repeated values
//		
//		int[] arr= {1,2,1,2,4};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=0;
//			for(int j=0;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++; //comes all duplicate values
//				}
//			}
//			if(count%2==1)
//			{
//				System.out.println(arr[i]);
//				break;
//			
//			}
//		}
	
	
		
		
//		int[] arr= {1,2,1,2,4,5,6,6,5,4,2,4,2,4,1,1,5,10};
//		
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			int count=0;
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if(arr[i]==arr[j])
//				{
//					count++;
//				}
//			}
//			
//			if(count%2==1)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
