package JAVA8FullCourse4_S_6Videos;


/*1)IF WE ARE WRITING THE CLASS THAT EXTENDS Thread class
Thread t=new Thread()
{
..........................
};

2IF )WE ARE WRITING THE INTERFACE THAT IMPLEMENTS Runnable interface
Runnable r=new Runnable()
{
..................................
};


*/

















public class Java8_LambdaExp_Fi5 {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		
		//CREAETING OBJCET FOR RUNNABLE INTERFACE
		Runnable r=new Runnable()
				{
			
		//CHILD THREAD PROCESSING
					public void run() 
					{
						for(int i=0;i<10;i++)
						{
							System.out.println("child thread");
						}
					}
			};
				
		Thread t=new Thread(r);
		t.start();
		
		//MAIN THREAD PROCESSING
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}

