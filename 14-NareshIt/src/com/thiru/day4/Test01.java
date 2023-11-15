package com.thiru.day4;


class MyOuter1
{
      static int x = 7;
      class MyInner1
      {
            public static void seeOuter()  //MyInner1.seeOuter();
            {
                  System.out.println("Outer x is "+x);
            }
      }
}



public class Test01 {

	public static void main(String[] args) {
		 MyOuter1.MyInner1 m = new MyOuter1().new MyInner1();
		  m.seeOuter();

	}

}
