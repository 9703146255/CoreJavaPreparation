package com.thiru.day4;
//Note :- We can declare an inner class as public.


class OuterClass 
{
	int x;
	public class InnerClass
	{
		int x;
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		OuterClass.InnerClass oi=new OuterClass().new InnerClass();
	   System.out.println(oi.x);
	}

}
