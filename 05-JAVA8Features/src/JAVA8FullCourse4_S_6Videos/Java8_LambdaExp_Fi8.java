package JAVA8FullCourse4_S_6Videos;

public class Java8_LambdaExp_Fi8 {
	// I WANT TO SORT ALL EMPLOYEES BASED ON EMPLOYEE ID

	public static void main(String[] args) {
		
		/*
		 * Runnable r=new Runnable() { public void run() { for(int i=0;i<10;i++) {
		 * System.out.println("child thread"); } } };
		 * 
		 * Thread t=new Thread(r); t.start(); for(int i=0;i<10;i++) {
		 * System.out.println("main thead"); }
		 */
		
		
		
		Runnable r=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("child thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thead");
		}
		
		}
}

