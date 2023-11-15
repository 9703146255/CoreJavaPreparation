package com.thiru.day4;

/*
 Note :- We can't declare an outer class as private or protected
  but an inner class we can declare with private and protected access modifiers.
 */

class OuterClass3 
{
	int x;
	protected class InnerClass3
	{
		int x;
	}
}
public class Test03 {

	public static void main(String[] args) {
		OuterClass3.InnerClass3 oi=new OuterClass3().new InnerClass3();
        System.out.println(oi.x);
	}

}
