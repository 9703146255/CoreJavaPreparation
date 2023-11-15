package com.thiru.statickeyword.var2;
/*
 Program of the counter without static variable
In this example, we have created an instance variable named count which is incremented in the constructor. 
Since instance variable gets the memory at the time of object creation,
each object will have the copy of the instance variable.
If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.

 */
public class Counter {
	int count=0;//will "get memory each time" when the instance is created  
		  
		Counter()
		{  
		count++;//incrementing value  
		System.out.println(count);  
		}  

	public static void main(String[] args) {
			//Creating objects  
			Counter c1=new Counter();  
			Counter c2=new Counter();  
			Counter c3=new Counter();  

	}

}
