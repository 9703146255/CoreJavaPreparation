package com.thiru.start;


/*


1)Access Array Elements
//======================
access array elements
array[index]

2)ACCESSING ELEMENT BY USING FOR LOOP
=====================================
array[index]

3)ACCESSING ELEMENTS BY USING FOR EACH LOOP
4)SUM OF THE ELEMENTS IN THE ARRAY
5)COPY OF THE ELEMENTS IN THE ARRAY IS
6)Print positive and negative elements seperatly
7)Print Highest and lowest value in the array
8)Display elements in Ascending order
9)Display elements in Descending order




AVERAGE OF THE ELEMENT IN THE ARRAY 
 
*/




public class Arrays05 {

	public static void main(String[] args) {
		
////		int[] marks= {50,60,70,40,80,90};
////		int sum=0;
////		double avg=0;
////		int size=marks.length;
////		
////		for(int i=0;i<size;i++)
////		{
////			sum=sum+marks[i];
////		}
////		avg=sum/size;
////		System.out.println("Sum of the elements in the array :"+sum);
////		System.out.println("Average elements in the array is :"+avg);
//		
//		
//	
//		
//		
////		3)ACCESSING ELEMENTS BY USING FOR EACH LOOP
//		
//		
////	4)SUM OF THE ELEMENTS IN THE ARRAY
//		int[] a= {10,20,30,40,50};
//		int sum =0;
//		
//		for(int a1:a)
//		{
//			sum=sum+a1;
//		}
//		System.out.println(sum);
//		
//		
//		//or 
//		
//		int len=a.length;
//		int i=0;
//		int sum1=0;
//		while(i != len)
//		{
//			sum1=sum1+a[i];
//			
//			i++;
//		}
//		System.out.println(sum1);
//		
//		
//		//or 
//		
//		
//		int sum2=0;
//		for (int j = 0; j < a.length; j++) {
//			sum2=sum2+a[j];
//		}
//		System.out.println(sum2);
//		
//		//or 
//		
//		
//		
////	5)COPY OF THE ELEMENTS IN THE ARRAY IS
//		
//		int[] x= {10,2,5,8,9};
//		int len1=x.length;
//		int[] y=new int[len];
//		for(int k=0;k<len;k++)
//		{
//			y[k]=x[k];
//		}
//		
//	    for(int i1=0;i1<len1;i1++)
//	    {
//	    	System.out.println(x[i1]);
//	    }
//	    
//	    for(int i2=0;i2<len1;i2++)
//	    {
//	    	System.out.println(y[i2]);
//	    }
//		
////	6)Print positive and negative elements seperatly
//	    
//	    int[] posNeg= {10,20,30,-50,-60,-70,0,0};
//	    for(int pos=0;pos<posNeg.length;pos++)
//	    {
//	    	if(posNeg[pos]>0)
//	    	{
//	    		System.out.println("positive values :"+posNeg[pos]);
//	    	}
//	    	
//	    	if(posNeg[pos]<0)
//	    	{
//	    		System.out.println("negative values :"+posNeg[pos]);
//	    	}
//	    	if(posNeg[pos]==0)
//	    	{
//	    		System.out.println("zeroes :"+posNeg[pos]);
//	    	}
//	    }
//	    
//	    
//	    
////	7)Print Highest and lowest value in the array
//	    
//	    
//	    int[] a1= {10,30,40,80,90,100};
//	    int len2=a1.length;
//	    int high=0;
//	    int low=0;
//	    for(int h=0;h<len2;h++)
//	    {
//	    	if(high<a1[h])
//	    	{
//	    		high=a1[h];
//	    	}
//	    	
//	    }
//	    
//	    for(int v=0;v<len2;v++)
//	    {
//
//	    	if(low>a1[v])
//	    	{
//	    		low=a1[v];
//	    	}
//	    }
//	    System.out.println(high);
//	    System.out.println(low);
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	8)Display elements in Ascending order
//		int[] a= {10,20,30,40,80,10,5,4};
//		int temp;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//			}
//		}
//		
//		for(int k=0;k<a.length;k++)
//		{
//			System.out.println(a[k]);
//		}
//	9)Display elements in Descending order	
		
		
		int[] a= {10,20,30,40,80,10,5,4};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
