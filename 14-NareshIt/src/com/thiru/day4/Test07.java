package com.thiru.day4;
/*
 Note :- display() method is available in Outer class as well as in Inner class,
  in the above program inner class display method will be invoked because we are calling the display method from the inner class object.
 */

class OuterClass7 
{
	private int x=200;
	class InnerClass7
	{
		public void display()  //Inner class display method
		{
		System.out.println("Inner class display method");
		}
		
		public void getValue()
		{
			display();
			System.out.println("Can access outer private var :"+x);
		}
	}

		public void display()  //Outer class display method
		{
			System.out.println("Outer class display");
		}	
}


public class Test07 {

	public static void main(String[] args) {
		OuterClass7.InnerClass7 inobj = new OuterClass7().new InnerClass7();
		inobj.getValue();
		
		new OuterClass7().display();
		

	}

}
