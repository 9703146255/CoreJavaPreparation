package com.thiru.start1;

import java.util.Scanner;

/*

1)Find the duplicate value in the array
intput = 2,3,4,5,8,5,4,7  o/p==>4,4,5,5


2)Search element in the array


3)pair become 9==>{1,2,3,4,5,6,7}
sum=9
low=0	(first value)
high=a.length-1 (last value)



step1: declare array,l=0,h=a.len-1,sum=9.
step2: while(l<h)==> a[l]+a[h]<sum  l++
step2: while(l<h)==> a[l]+a[h]<sum  h--
step3: while(l<h)==> a[l]+a[h]==sum  l++,h--
 */

public class S03String {

	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,4,5,6,7};
		int high=a.length-1;
		int low=0;
		int sum=9;
		
	    while(low<high)
	    {
	    	if(a[low]+a[high]<sum)
	    	{
	    		low++;
	    	}
	    	else if(a[low]+a[high]<sum)
	    	{
	    		high--;
	    	}
	    	else if(a[low]+a[high]==sum)
	    	{
	    		System.out.println(a[low]+","+a[high]);
	    		low++;
	    		high--;
	    	}
	    }

		
	
		
		
		
		
	}

}
