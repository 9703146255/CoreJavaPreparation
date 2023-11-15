package com.thiru.justcode;

public class FindFirstNumberOccureOddNumberOfTimes {
	public static void main(String[] args) {
		
		int[] arr= {1,2,1,2,4,5,6,6,5,4,2,4};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count%2==1)
			{
				System.out.println(arr[i]);
				break;
			
			}
		}
		
	}

}
