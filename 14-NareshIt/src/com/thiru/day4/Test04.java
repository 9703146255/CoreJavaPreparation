package com.thiru.day4;



class OuterClass4 
{
	int x;
	protected class InnerClass4
	{
		int x;
	}
}



public class Test04 {

	public static void main(String[] args) {
		OuterClass4.InnerClass4 oi=new OuterClass4().new InnerClass4();
        System.out.println(oi.x);

	}

}
