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
interface Java8_5 
{
		public void m1(); //ABSTRACT METHOD
}
@FunctionalInterface  
interface Java8_6 extends Java8_5
{
					//HERE WE ARE USING PARENT ABSTRACT METHOD
}
	



