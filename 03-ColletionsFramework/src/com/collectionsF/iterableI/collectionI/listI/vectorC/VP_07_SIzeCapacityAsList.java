package com.collectionsF.iterableI.collectionI.listI.vectorC;

import java.util.Arrays;
import java.util.Vector;

public class VP_07_SIzeCapacityAsList {

	public static void main(String[] args) {
	
		
		//how many elements is there that is our capacity/size also
		//Size() -->no of elements present in the list object
		//capacity()--> array capacity 10
		//generics --> if i am adding strings values to the integer values we will get error, 
		//vector 1.0 version
		//collections 1.2 version
		
		
		//NOTE: WE CAN'T CREATE OBJECTS FOR  PRIMITIVE DATA TYPES  X  ==> int i=new int()
		// NON-PRIMITIVE DATA TYPES WE CAN  CREATE THE OBJECTS
		
		
//		Object[] arr=new Object[] {1,5,4,6,8};
//		Vector<Integer> v1=new Vector(Arrays.asList(arr));  //Arrays.asList(size)its will convert arrays to list
//		//v1.add("thirumalesh");
//		int sum=0;
//		
//		//Normal loop we can use "get()" method
//		for(int i=0;i<v1.size();i++)
//		{
//			sum += (Integer) v1.get(i);  
//		} 
//		//irritating developers is there how can we add string to int
//		//we can't added string to the integer
//		//then introduced generics<MENTIONED HERE NON-PRIMITIVE DATA TYPES
//		//Integer means we can add integer values only
//		//Stirng means we can add string values only
//		//we can avoid this problem by using generics
//		
//		System.out.println(sum);
//		System.out.println(v1);
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
		
		
		
		
//		Object[] obj=new Object[] {10,20,30,40,50};
//		
//		Vector<Integer> v=new Vector(Arrays.asList(obj));
//		System.out.println(v);
//		int sum=0;
//		
//		for (int i = 0; i < v.size(); i++) {
//			
//			sum +=v.get(i);
//		}
//		System.out.println(sum);
		
		
		
		
		
		
//		Object[] obj=new Object[] {1,2,3,4};
//		Vector<Integer> v1=new Vector(Arrays.asList(obj));
//		int sum=0;
//		for(int i=0;i<v1.size();i++)
//		{
//			sum+=v1.get(i);
//		}
//		System.out.println(sum);
		
		
		
		
		
//		
//		Object[] obj=new Object[] {10,20,30,40,50,60};
//		
//		Vector<Integer> vect=new Vector(Arrays.asList(obj));
//		System.out.println(vect);
//		System.out.println(obj);
//		
//		int sum=0;
//		
//		for (int i = 0; i < obj.length; i++) {
//			System.out.println(vect.get(i));
//		}
		
		
		
		
		
		Object[] obj=new Object[] {10,20,30,40,50};
		int sum=0;
		Vector<Integer> v=new Vector(Arrays.asList(obj));
		
		for (int i = 0; i < v.size(); i++) 
		{
			sum=sum+v.get(i);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
