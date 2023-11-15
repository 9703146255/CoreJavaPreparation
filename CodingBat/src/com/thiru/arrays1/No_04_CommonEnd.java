package com.thiru.arrays1;
/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */
public class No_04_CommonEnd {

	public static boolean commonEnd(int[] nums1,int nums2[])
	{
		return nums1[0]==nums2[0] || nums1[nums1.length-1]==nums2[nums2.length-1];
		
	}
	
	
	public static void main(String[] args)
	{

		System.out.println(commonEnd(new int[] {1, 2, 3},new int[] {7, 3}));
		System.out.println(commonEnd(new int[] {1, 2, 3},new int[] {7, 3, 2}));
		System.out.println(commonEnd(new int[] {1, 2, 3},new int[] {1, 3}));
		
	}

}
