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

step:1 ==>  dec & ini array
step:2 ==>for	==>  marks[i]>marks[j]  ==> ascending order
step:3 ==>for+1	==>  marks[i]<marks[j]  ==> Descending order
step:4 ==>display array ofter sort

*/



//6)Print elements in ascending order
public class Arrays09 {

	public static void main(String[] args) {
		
		
		int[] marks= {50,60,70,-55,40,80,90,-20,-30,0,0};
		int size=marks.length;
		int temp;
		
		//Ascending order i>j,Descending order i<j
        for(int i=0;i<size;i++)
        {
        	for(int j=i+1;j<size;j++)   
        	{                      			  //50 > 60 X
        		if(marks[i]>marks[j])		 //60 > 70  X
        		{							//70 > -55  /
        			temp=marks[i];			//-55  > 40  X
        			marks[i]=marks[j];		//40  > 80  X
        			marks[j]=temp;			//80  > 90  X
        		}							//90  > -20  /
        	}								//-20  > -30  /
        									//-30 > 0  X
        }									//0 > 0  X

        for(int i=0;i<size;i++)
        {
        	System.out.println(marks[i]);
        }


	}

}
