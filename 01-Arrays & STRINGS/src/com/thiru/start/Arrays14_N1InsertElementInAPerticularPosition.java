package com.thiru.start;

import java.util.Scanner;
/*
 
 Enter the elements :
1
2
3
4
Printed Elemets before Inserted
1
2
3
4
0
Enter the location at which we want to insert
2
Enter the values at which we want to insert
20
1
2
20
3
4

 
 step-1: set size(enter elements one less value)
 step-2: access one for loop
 step-3: enter location
 step-2: enter the value
 
 
 
 
 
 */

public class Arrays14_N1InsertElementInAPerticularPosition {

	public static void main(String[] args) {
		
		//step-1: 	enter the elements				==>	1,2,3,4
		//step-2: 	Printed Elemets before Inserted	==>	1,2,3,4,0
		//step-3 	Enter the location at which we want to insert (index position): 2
		//step-4: 	Enter the value at which we want to insert: 20
		//Resulting Array:
		//	1
		//	2
		//	20
		//	3
		//	4
		//	5
		
		
		
		
		
		int[] a=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements :");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printed Elemets before Inserted");
		for(int val:a)
		{
			System.out.println(val);
		}
		
		
		System.out.println("Enter the location at which we want to insert");//index position 2
		int location=sc.nextInt();
		
		System.out.println("Enter the value at which we want to insert");//value  20
		int val=sc.nextInt();
		 
		
		
		//reverse order
		for(int i=a.length-1;i>location;i--)  //2=>i=4;4>2;4-- //3>2  3--   //2>2 false
		{
			a[i]=a[i-1];                     //a[i]=a[4] ==>   //a[i]=a[3]
		}
		
		
		
		
		a[location]=val;
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}
