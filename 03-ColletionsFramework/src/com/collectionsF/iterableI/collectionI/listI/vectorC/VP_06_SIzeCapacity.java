package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Vector;

public class VP_06_SIzeCapacity {

	public static void main(String[] args) {
        Vector<String> v1 =new Vector<>();
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 v1.add(0,"raj");  //it will occupy 1st bed
		 v1.add("yadagiri");
		 
		
		 
		 
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	}

}
