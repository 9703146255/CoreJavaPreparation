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



class Parent1 implements Runnable
{

	//CHILD THEAD PROCESSING HERE
	public void run() {
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
	
	}
	
}

public class Java8_LambdaExp05
{
	public static void main(String[] args) {
		
		Parent1 p1=new Parent1();
		Thread t=new Thread(p1);
		t.start();
		
		//MAIN THREAD PROCESSING HERE
		for(int i=0;i<10;i++)
		{
		System.out.println("main thread");
		}
		
		
	}
}




