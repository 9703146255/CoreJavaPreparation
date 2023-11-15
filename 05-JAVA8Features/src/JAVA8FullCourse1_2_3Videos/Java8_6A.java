package JAVA8FullCourse1_2_3Videos;



/*
 * 
 * 
 * @FunctionalInterface
 * ====================
 * it is not mandatory its optional.
 * advantage of this annotaion is if we don't follow FI rules then we will get error
 * 
 * FUNCTIONAL INTERFACE
 * ====================
 * An interface which is having only one abstract method
 * we can take any no of Default methods 
 * we can take any no of static methods
 */



// BY UING INHERITANCE CONCEPTS
@FunctionalInterface  
interface Java8_6A 
{
		public void m1();  //SAME ABSTRACT METHOD THERE IS NO PROBLEM
}
@FunctionalInterface  
interface Java8_7 extends Java8_6A
{
	public void m1(); //its was overriding here from above/PARENT CLASS  abstract method
	
	                   //we are not used any new key word thats why its possible
	//public void m2(); //IF HAVING TWO ABSTRACT METHODS SO NOT POSSIBLE HERE
}
	



