package com.thiru.start1;


/*
case1: key==mid
case2: key>mid  l=mid+1
case3: key<mid  h=mid-1

key=90
key=20
key=85
================================================================================================
  			  a[0] 		a[1]		a[2]	a[3]	a[4]	a[5]	a[6]	a[7]	a[8]	a[9]
  ===============================================================================================
  elements===> 10,  	20,			30,     40,   	50,		60,		70,		80,		90,		100
  ===============================================================================================
  				L									M										H
  				==============================================================================
  







 */


public class S09StringsBinarySearch {

	public static void main(String[] args) {

//		boolean flag=false;
//		int key=10;
//		int[] a= {10,20,30,40,50,60,70,80,90,100};
//		
//		int l=0;
//		int h=a.length;
//		
//		while(l<=h)
//		{
//			int m=(l+h)/2;
//			if(a[m]==key)
//			{
//				System.out.println("element found");
//				flag=true;
//				break;
//			}
//			if(a[m]<key)  //less thean l monkey
//			{
//				l=m+1;
//			}
//			if(a[m]>key)  //greater than h
//			{
//				h=m-1;
//			}
//		}
//		
//		if(flag==false)
//		{
//			System.out.println("element is not found");
//		}
	
	
	
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		int l=0;
		int h=a.length;
		int key=30;
		boolean flag=false;
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(a[m]==key)
			{
			  	System.out.println("found");
			  	flag=true;
			  	break;
			}
			if(a[m]>key) //great h=m-1
			{
				h=m-1;
			}
			if(a[m]<key) //less l=m+1
			{
				l=m+1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("element is not found");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
