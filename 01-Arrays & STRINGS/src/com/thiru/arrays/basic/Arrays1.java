package com.thiru.arrays.basic;

public class Arrays1 {
	
	/*
	 * WHAT IS WRAPPER CLASSES 
	 * ======================== 
	 * Non-premitive datatypes/Objects  is also called as a wrapper classes
	 * 
	 *The wrapper class in Java is used to convert "primitive data types into objects/non-primitive datatypes".
	 *==> if we want to perform extra operations we can use wrapper classes 
	 * 
	 *why java is not 100% obj orineted -->
	 * ====================================== //we can't create objects for
	 * primitive data types-->byte,short,char,int,long,float,double,boolean
	 * 
	 * primitive datatypes(8)(start with lowercase)  BSCILFDB
	 * -->byte,short,char,int,float,long,double,boolean
	 * 
	 * //non-primitive datatypes(wrapper classes))(start with upper case)
	 * -->Byte,Short,Integer,Long,Double,Boolean,Character,Float
	 * 
	 * //primitive data types-->if we want to store data directly //int i=new int()
	 * X its not possible for object creation
	 * 
	 * 
	 * 
	 * 
	 * //java is object oriented programming language that means every thing is
	 * object in java //than only java is pure object oriented programming language
	 * //becouse we nannot create object for premitive data types
	 * 
	 * //object created data types are non premitive data types //arrays ,strings,
	 * collections are non premitive data types (ASC) ASCENDING ORDER
	 
	 DIFFERENCE BETWEEN ARRAYS AND ARRAYLIST
	 =======================================
	 						ARRAYS																ArrayList
	 						======																=========
beahavior	 				An array is a fixed-length data structure.			 				ArrayList is a variable-length data structure.
	 			
Dimensionality 	 			It can be single-dimensional or multidimensional 					It can only be single-dimensional 

Traversing Elements 		For and for each generally is used for iterating over arrays		Here iterator is used to traverse over ArrayList 

Length 						length keyword can give the total size of the array.				size() method is used to compute the size of ArrayList.

Size						It is static and of fixed length									It is dynamic and can be increased or decreased in size when required.

Speed						It is faster as above we see it of fixed size it of fixed size		It is relatively slower because of its dynamic nature 

Primitive Datatype Storage	Primitive data types can be stored directly unlikely objects		Primitive data types are not directly added unlikely arrays, they are added indirectly with help of autoboxing and unboxing

Generics					They can not be added here hence type unsafe 						They can be added here hence makingArrayList type-safe.					
					
Data manupulation			collections data manupulation is easy comp to al					arlist data manupulation is fast

Shuffling operations		complex in arrays													easy in al

ready made methods			not have															its have
					
					
					
					
					
	 */	
	public static void main(String[] args) {
		
		//boolean default value is -->false
		//String default value is -->null
		//int default value is-->0
		
		//Arrays creation by using primitive data types
//		int[] k; //declaration
//		int []j;
//		int m[];
//		int[] i=new int[10]; //declaration and memory size fixation
//		String[] s=new String[10];
//		char[] c=new char[10];
//		long[] l=new long[10];
//		float[] f=new float[10];
//		double[] d=new double[10];
//		short[] s1=new short[10];
//		boolean[] b=new boolean[10];
		
		int[] k1;
		int []k2;
		int k3[];
		int[] k=new int[20];
		String[] s=new String[30];
		
		
		
		
		
		int[] a= {10,20,30,40,1,60,70,80,90,100};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
	}

}
