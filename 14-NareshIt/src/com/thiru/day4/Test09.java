package com.thiru.day4;
//local inner class we can't access outside of the method


class MyOuter9
{
      private String x = "Outer3";
      public void doSttuff()
      { 
           String z = "local variable";  
            class MyInner9        
            {
                 public void seeOuter()
                 {
                      System.out.println("Outer x is "+x);
                      System.out.println("Local variable z is : "+z);
                 }
           }		    
      }
      //these place is outside of the class
	 // MyInner9 mi = new MyInner9();
		//	mi.seeOuter(); //error   
	  
}

public class Test09 {

	public static void main(String[] args) {
		
	            MyOuter9 m = new MyOuter9();
	            m.doSttuff();  
	      

	}

}
