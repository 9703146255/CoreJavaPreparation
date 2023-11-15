package com.thiru.arrays1;
/*
 Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */
public class No_05_Sum3 {

	
	public static int sum3(int[] nums)
	{
		
		//return nums[0]+nums[1]+nums[2];
		int sum=0;
		for(int n:nums)
		{
			sum=sum+n;
		}
		return sum;
		
	}
	
	
	
	public static void main(String[] args) {

		
		System.out.println(sum3(new int[] {1,2,3}));
		System.out.println(sum3(new int[] {5,11,2}));
		System.out.println(sum3(new int[] {7,0,0}));
		
		
		
	}

}
