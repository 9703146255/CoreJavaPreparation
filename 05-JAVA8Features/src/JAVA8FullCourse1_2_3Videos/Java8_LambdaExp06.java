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
* ==>BY USING MULTITHREDDING 
* ==>A INTERFACE WHICH IS HAVING ONE ABSTACT METHDO CALLED FI
* ==>HERE HAVING ONLY ONE RUN() METHOD
* 
* 
*/



public class Java8_LambdaExp06
{
	public static void main(String[] args) 
  {

		
		//r=()
		Runnable r=()->              //Runnable lambda(for)
		{
			//CHILD THREAD PROCESSING
			for(int i=0;i<10;i++)
			{
			System.out.println("child thread");
			}
		};
		
		Parent1 p1=new Parent1();
		Thread t=new Thread(p1);
		t.start();
		
		//MAIN THREAD PROCESSING
		for(int i=0;i<10;i++)
		{
		System.out.println("main thread");
		}
	
		
	}}



