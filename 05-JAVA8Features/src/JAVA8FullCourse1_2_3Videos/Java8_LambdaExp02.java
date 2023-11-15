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
 * 
 * 
 * 
 * where the functional interfaces is there on that place we can use lambda expressions
 * LAMBDA EXPRESSION IS APPLICABLE FOR FUNCTIONAL INTERFACES ONLY
 */





//FI
interface InterfaC
{
		public void add(int a,int b);
}

//IMPLEMETNING FI
class Chotu implements InterfaC
{
   public void add(int a, int b) {
		System.out.println("sum of a+b is :"+(a+b));
}
	
/*(int a, int b)-> System.out.println("sum of a+b is :"+(a+b));*/
	}



public class Java8_LambdaExp02
{
	public static void main(String[] args) {
		
		
		InterfaC I=new Chotu();
		I.add(10, 20);
		
		
		
		
		
		
		
		
		
		
		
	}
}




