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

//FUNTIONAL INTERFACE
interface interf
{
		public void m1();
}

//MAIN CLASS
public class Java8_LambdaExp01
{
	public static void main(String[] args) {
		
		
		interf i=()->System.out.println("Hi I am funtional interface here...... by using lambda expressions");
		i.m1();
	
		
	}
}




