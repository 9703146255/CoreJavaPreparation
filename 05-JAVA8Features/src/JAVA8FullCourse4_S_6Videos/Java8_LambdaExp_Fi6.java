package JAVA8FullCourse4_S_6Videos;



/*1)WE ARE WRITING THE CLASS THAT EXTENDS Thread class
Thread t=new Thread()
{
..........................
};

2)WE ARE WRITING THE INTERFACE THAT IMPLEMENTS Runnable class
Runnable r=new Runnable()
{
..................................
};



These are anonymous inner classes
LAMBDA EXPRESSIONS ARE NOT POSSIBLE 

ANONYMOUS INNER CLASSES ARE POWERFULL

*/


public class Java8_LambdaExp_Fi6 {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		
		//This is executed child thread part
		Runnable r=()->
				{
				for(int i=0;i<10;i++)
				{
							System.out.println("child thread");
				}};
		//this is executed main thread part
		Thread t=new Thread(r);
		t.start();
		//MAIN THREAD PROCESSING HERE
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}

