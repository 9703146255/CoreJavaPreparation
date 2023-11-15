package com.thiru.day4;
/*
 3) Static Nested Inner class :
---------------------------------
A static inner class which is declared with static keyword inside an outer class is called static Nested inner class.

It cann't access non-static variables and methods  i.e (instance members) of outer class.

For static nested inner class, Outer class object is not required.

If a static nested inner class contains static method then object is not required for inner class. On the other hand if the static inner class contains instance method then we need to create an object for static nested inner class.
-----------------------------------------------------------------------
 */

//static nested inner class
class BigOuter
{
   static class Nest   //static nested inner class   
   {
        void go()  //Instance method of static inner class
        {
             System.out.println("Hello welcome to static nested class");  
        }  
   }
}
public class Test10 {

	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest();
        n.go();

	}

}
