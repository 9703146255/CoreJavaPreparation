package com.thiru.stringssubject;

public class String1 {
	
	//STRING IS NOTHING BUT SEQUENCE OF CHARACTERS
	//IT IS A CLASS IN JAVA BUT CONSIDER AS A LITERAL BECOUSE OF ITS UNIQUE BEHAVIOUR
	// PRIMITIVE DATA TYPES ARE-->int,char,float,double, non primitive-->arrays,collections,classes

	public static void main(String[] args) {
		
		String s1="Thiru";  //1001ef  it will store in string constant pool
		String s2=new String("Thiru");  //it will store in HEAP MEMORY//all object will store
		String s3="Thiru"; //1001ef
		String s4="findmethiru@gmail.com"; 
		
		
		System.out.println("s1.hashCode() :"+s1.hashCode());
		System.out.println("s2.hashCode() :"+s2.hashCode());
		System.out.println("s3.hashCode() :"+s3.hashCode());
		System.out.println("s4.hashCode() :"+s4.hashCode());
		
		//it will compare the address
		System.out.println(s1==s2); //s1 and s2 is different address
		System.out.println(s1==s3); //s1 and s3 address is same
		
		//it will compare the content
		System.out.println(s1.contains(s2)); //s1 and s2 content is same
		System.out.println(s1.contains(s3)); //s1 and s3 content same
		
		//IT WILL COMPARE THE content
		System.out.println(s1.equals(s1));  //CONTENT IS EQUAL IN S1,S2,S3 CONTENT IS EQUAL THEN ALL CASES ITS GIVE TRUE
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//NOTE:  MAJOR CASES WE DONT USE ==> == , WE should use .equals case 
		


	}

}
