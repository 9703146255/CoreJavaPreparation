package com.thiru.start;






//declaration and Access Array based on index Elements
public class Arrays01 {

	public static void main(String[] args) {


		
				
		
	//serch the element is present or not
		
//		int[] a= {10,20,50,80,90,20};
//		int len=a.length;
//		int count=0;
//		int searchVal=20;
//		
//		for(int i=0;i<len;i++)
//		{
//			if(searchVal==a[i])
//			{
//				count++;
//			}
//		}
//		
//		if(count != 0)
//		{
//			System.out.println("the given values  :  "+searchVal+" is present	: "+count+"  times");
//		}
		
		
		
		
//		//to print duplicates
//		
//				int[] a= {40,50,60,80,70,88,80,40};
//				int len=a.length;
//				for(int i=0;i<len;i++)
//				{
//					boolean unique=true;
//					for(int j=i+1;j<len;j++)
//					{
//						if(a[i]==a[j])
//						{
//						System.out.println(a[i]);
//						}
//					}
//				}
		
		
	//print unique number of times
		
		
//		int[] a= {40,50,60,80,70,88,80,40};
//		int len=a.length;
//		for(int i=0;i<len;i++)
//		{
//			boolean unique=true;
//			for(int j=i+1;j<len;j++)
//			{
//				if(a[i]==a[j])
//				{
//					unique=false;
//				}
//			}
//			
//			if(unique)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		
		
		
		
		
	
		
		
//		//sort descending order
//		int[] a=  {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int len=a.length;
//		int temp;
//		for (int i = 0; i < len; i++) {
//			
//			for (int j = i+1; j < len; j++) 
//			{
//				if(a[i]<a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//		
//		for (int i = 0; i < len; i++) {
//			
//			System.out.println(a[i]);
//		}
		
//		//sort ascending order
//		int[] a=  {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int len=a.length;
//		int temp;
//		
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		//6)Print ascending order
////		//{50,60,70,-55,40,80,90,-20,-30,0,0};
//
//		int[] a= {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int len=a.length;
//		int temp;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i+1;j<len;j++)
//			{
//				
//				if(a[i]>a[j])
//				{	
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//			
//				
//			}
//		}
//		
//		for(int k=0;k<len;k++)
//		{
//			System.out.println(a[k]);
//		}
		
		
		
		
		
		
		
	//	print highest and lowest marks in the array
		
//		int[] a= {1,2,3,4,5};
//		int len=a.length;
//		int high=a[0];
//		int low=a[1];
//		for(int i=0;i<len;i++)
//		{
//			if(high<a[i])
//			{
//				high=a[i];
//			}
//			
//			if(low>a[i])
//			{
//				low=a[i];
//			}
//		}
//		System.out.println("higest value is : "+high);
//		System.out.println("lowest value is : "+low);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//{50,60,70,-55,40,80,90,-20,-30,0,0};
		//+ve values -ve values and 0 values
		
		
		
//		int[] a={50,60,70,-55,40,80,90,-20,-30,0,0};
//		int len=a.length;
//		
//		System.out.println("positive values");
//		for(int i=0;i<len;i++)
//		{
//			if(a[i]>0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		System.out.println("negative values");
//		for(int i=0;i<len;i++)
//		{
//			if(a[i]<0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		
//		System.out.println("zeroes values");
//		for(int i=0;i<len;i++)
//		{
//			if(a[i]==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		
		
		//{50,60,70,-55,40,80,90,-20,-30,0,0};
		//+ve values -ve values and 0 values	
		
		
		
//		int[] a= {50,60,70,-55,40,80,90,-20,-30,0,0};
//		int len=a.length;
//		
//		System.out.println("positive elements are:");
//		for(int i=0;i<len;i++)
//		{
//			
//			if(a[i]>0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		
//		System.out.println("negative elements are:");
//		for(int i=0;i<len;i++)
//		{
//			
//			if(a[i]<0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		
//		System.out.println("zero elements are:");
//		for(int i=0;i<len;i++)
//		{
//			
//			if(a[i]==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] marks= {50,60,70,40,80,90};
//		int sum=0;
//		
//		for(int i=0;i<marks.length;i++)
//		{
//			sum=sum+marks[i];
//		}
//		System.out.println(sum);
//		
//		
////		for(int var:marks)
////		{
////			sum+=var;
////		}
////		System.out.println(sum);
		
		
		
		
//		int[] a= {10,20,30,40,50};
//		int len=a.length;
//		int sum=0;
//		
//		for(int i=0;i<len;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println("sum"+sum);
//		System.out.println("average"+sum/len);
		
		
		//copy from one to another
//		
//		int[] a= {10,20,30,40,50};
//		int len=a.length;
//		int[] b=new int[len];
//		for(int i=0;i<len;i++)
//		{
//			b[i]=a[i];
//		}
//		
//		System.out.println("befor");
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("after");
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(b[i]);
//		}
		
		
		
		
		
//		int[] a= {10,20,30,40,50,60};
//		int len=a.length;
//	       
//		//forward printing
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		
//		System.out.println();
//		//reverse printing
//		for(int i=len-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("TYPE-1");
//		int[] age= {25,26,24,28,35};
//		
//		//accessing elements based on indexing
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);
//		System.out.println(age[3]);
//		System.out.println(age[4]);
//		//System.out.println(age[5]);
//		//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		
//		
//		System.out.println("TYPE-2");
//		int[] age1=new int[5];
//		age1[0]=10;
//		age1[1]=20;
//		age1[2]=30;
//		age1[3]=40;
//		age1[4]=50;
//		//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//		
//		System.out.println(age1[0]);
//		System.out.println(age1[1]);
//		System.out.println(age1[2]);
//		System.out.println(age1[3]);
//		System.out.println(age1[4]);
//		//System.out.println(age1[5]);
//		
//		
//		
//		System.out.println("TYPE-2");
//		int[] age2=new int[] {10,20,30,40,50};  //new int[X] get error
//		
//		System.out.println(age2[0]);
//		System.out.println(age2[1]);
//		System.out.println(age2[2]);
//		System.out.println(age2[3]);
//		System.out.println(age2[4]);
		
	
		
		
		
		
		
	}

}
