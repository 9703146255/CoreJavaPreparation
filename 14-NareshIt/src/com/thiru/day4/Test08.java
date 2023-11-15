package com.thiru.day4;
/*
 ----------------------------------------------------------------------
2) Method local inner class :
 -------------------------------
 If a class is declared inside the method then it is called  method local inner class.

 We cann't apply any access modifier on method local inner class but they can be marked as abstract and final.

 A local inner class we can't access outside of the method that means the scope of method local inner class within the same method only.
-----------------------------------------------------------------------
 */
class MyOuter8
{
      private String x = "Outer class private data";

      public void doSttuff()
      { 
           String z = "local variable";  //must be final till JDK 1.7

           class MyInner8  //only final and abstract is possible
           {
                 public void seeOuter()
                 {
                      System.out.println("Outer x is : "+x);
                      System.out.println("Local variable z is : "+z);
                 }
           }
           MyInner8 mi = new MyInner8();
           mi.seeOuter();
      }
}

public class Test08 {

	public static void main(String[] args) {
		MyOuter8 m = new MyOuter8();
        m.doSttuff();  

	}

}
