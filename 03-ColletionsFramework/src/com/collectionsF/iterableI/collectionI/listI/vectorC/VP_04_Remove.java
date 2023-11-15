package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Vector;

public class VP_04_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vector is a class we can create object for that
		//2 ways we can remove 
		//by using "index" position number
		//by using "content" we can remove
		//REMOVE-->INDEX POSITION,CONTENT
		
		 Vector v1 =new Vector();
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 
		 System.out.println(v1);
		 
		 
		 
//		 //BASED ON INDEX POSITION REMOVE
		 
		 
		 
//		 //it will print name and remove
//		 System.out.println("--------BASED ON INDEX REMOVE-----------------------");
//		 System.out.println(v1.remove(0)); //give index position
//		 System.out.println(v1);
//		 
//		
//		 //BASED ON CONTENT REMOVE
		 
		 
		 //IT WILL PRINT TRUE IF DATA PRESENT, PRINT FALSE IF THE DATA IS NOT THERE
		 System.out.println("--------BASED ON CONTENT REMOVE-----------------------");
		 System.out.println(v1.remove("jeevan")); //content
		 System.out.println(v1);
		 
		 

		 
		 

	}

}
