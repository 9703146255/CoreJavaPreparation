package com.thiru.day4;

class Outer11
{  
	  static int x=15;  

	  static class Inner11
	  {  
			void msg()
				{
					System.out.println("x value is  "+x);
				}  
	  }
}

public class Test11 {

	public static void main(String[] args) {
		Outer11.Inner11 obj=new Outer11.Inner11();  
		obj.msg();  

	}

}
