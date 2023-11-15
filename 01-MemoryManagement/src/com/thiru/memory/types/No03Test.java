package com.thiru.memory.types;
/*
 we fixed here 
 
 start =1
 step  =+1
 stop  ....not mention like recurtion ==> a function is calling itself
 */
 class No03Test 
{
//	 public void add(int i)
//	  {
//		  System.out.println(i);
//		  i++;
//		  add(i);
//	  } 
//	 
//	 
//	 
//  public static void main(String args[])
//  {
//	 new No03Test().add(1);; 
//  }
	 
	 
	 
	 public void add(int i)
	 {
		
		 System.out.println(i);
		 i++;
		 add(i);
	 }
	 
	 
	 public static void main(String[] args) {
		
		 
		// new No03Test().add(1);
		 
		 No03Test  obj1= new No03Test();
		 obj1.add(1);
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  
  
}
