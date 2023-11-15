package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Arrays;
import java.util.Vector;

public class VP_08_Generics {

	public static void main(String[] args) {

		
		Vector<Integer> v1=new Vector<Integer>();  //Arrays.asList(size)its will convert arrays to list
		v1.add(null);
		v1.add(10);
		v1.add(10);
		v1.add(30);
		v1.add(40);
		v1.add(50);


		//we can't added string to the integer
		//then introduced generics<MENTIONED HERE NON-PRIMITIVE DATA TYPES
		//what ever the order we insert that order will be follow
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
		

	}

}
