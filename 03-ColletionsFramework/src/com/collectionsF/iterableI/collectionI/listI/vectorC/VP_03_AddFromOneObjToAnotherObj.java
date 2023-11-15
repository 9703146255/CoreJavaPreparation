package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Vector;

public class VP_03_AddFromOneObjToAnotherObj {

	public static void main(String[] args) {
        Vector v1 =new Vector();
		 
		 v1.add("yadagiri");
		 v1.add("jeevan");
		 v1.add(0,"raj");  //it will occupy 1st bed
		 
		Vector v2=new Vector();
		v2.add("yaswin");
		v2.add("charan");
		
		//we are adding here two values only so size v2.size() was taken
		
		
//		System.out.println("-------------------------normal for loop use--> get()--------------------------------------"); 
//		System.out.println(v1); //before
//		
//		for(int i=0;i<v2.size();i++)
//		{
//			v1.add(v2.get(i));        //all v2 values will store in v1
//		}
//		System.out.println(v1);  //after
//		System.out.println("-------------------------------------------------------------------------------------"); 
//		
//		//or we will take add all method
//		
//		//AddAll() -->we have to add one vector class object to another class object
//		//v1.addAll(v2); -->v2 obj values store in v1
//		System.out.println("-------------------------------------------------------------------------------------"); 
//		System.out.println(v1); //before
//		v1.addAll(v2); 
//		System.out.println(v1);  //after
//		System.out.println("-------------------------------------------------------------------------------------"); 
//		
//		//Add based on the index OR SPECIFIC position
//		System.out.println(v1); //before
//		v1.addAll(0,v2); // v2 obj values store in v1 in specific position postion
//		System.out.println(v1);  //after
//		System.out.println("-------------------------------------------------------------------------------------"); 
	
		
	System.out.println(v1+"  "+v2);
//	for(int i=0; i < v2.size();i++ )
//	{
//		System.out.println(v1.add(v2.get(i)));
//	}
//		
//	System.out.println(v1);	
	v1.addAll(v2);
	System.out.println(v1);
		
	}

}
