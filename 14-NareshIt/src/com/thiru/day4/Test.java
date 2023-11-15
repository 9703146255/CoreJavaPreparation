package com.thiru.day4;
class MyOuter
{
      private int x = 15;
      class MyInner
      {
            public void seeOuter()
            {
                  System.out.println("Outer x is "+x);
            }
      }
}
public class Test {

	public static void main(String[] args) {
		   MyOuter.MyInner m = new MyOuter().new MyInner();
		   m.seeOuter();

	}

}
