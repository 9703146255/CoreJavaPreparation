package com.thiru.memorymanagement;

public class StackeMemoryAllocation {
	
	
	 public void add(int i)
	    {
	    	System.out.println(i);
	    	i++;
	    	add(i); //Recursion : a function is calling itself called Recursion
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackeMemoryAllocation hp=new StackeMemoryAllocation();
		hp.add(1);
		//20386
		//20388
		//20375
		//-Xss2m ==>42246
		//-Xss3m ==>66007
		//java.lang.stackOverflowError

	}

}
