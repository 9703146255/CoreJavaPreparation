package com.thiru.start;


/*
 
1)Access Array Elements
//======================
access array elements
array[index]

2)ACCESSING ELEMENT BY USING FOR LOOP
3)ACCESSING ELEMENTS BY USING FOR EACH LOOP

*/



//Access Array Elements By using loops
public class Arrays03 {

	public static void main(String[] args) {

		
		System.out.println("TYPE-1===================================================================================");
		int[] age= {25,26,24,28,35};
		
		System.out.println("XXXXXXXXXX BY UISING FOR LOOP XXXXXXXXXX");
	    for(int i=0;i<age.length;i++)
	    {
	    	System.out.println(age[i]);
	    }
	    System.out.println("XXXXXXXXXX BY UISING FOR EACH LOOP XXXXXXXXXX");
	    for(int res:age)
	    {
	    	System.out.println(res);
	    }
		System.out.println("TYPE-2===================================================================================");
		int[] age1=new int[5];
		age1[0]=10;
		age1[1]=20;
		age1[2]=30;
		age1[3]=40;
		age1[4]=50;
			System.out.println("XXXXXXXXXX BY UISING FOR LOOP XXXXXXXXXX");
		   for(int i=0;i<age1.length;i++)
		    {
		    	System.out.println(age1[i]);
		    }
		   System.out.println("XXXXXXXXXX BY UISING FOR EACH LOOP XXXXXXXXXX");
		    for(int res1:age1)
		    {
		    	System.out.println(res1);
		    }
		
		
		System.out.println("TYPE-3===================================================================================");
		int[] age2=new int[] {10,20,30,40,50};  //new int[X] get error
		
		
			System.out.println("XXXXXXXXXX BY UISING FOR LOOP XXXXXXXXXX");
		   for(int i=0;i<age2.length;i++)
		    {
		    	System.out.println(age2[i]);
		    }
		
	       System.out.println("XXXXXXXXXX BY UISING FOR EACH LOOP XXXXXXXXXX");
		    for(int res2:age2)
		     {
		    	System.out.println(res2);
		    }
		
		
		
		
		
	}

}
