package in.thiru;



/*
 Steps to  create and run thread
 ===============================
	step:1 create thread class that should extends thread classa and implemnennts runnavle interface
	step:2 write run() method 
	step:3 create an object for above class
	step:4 create a thread object and link it with our class object  which is created in step3
	step:5 run the thread by using thread by using start()
 */

//step:1 create thread class that should extends thread classa and implemnennts runnavle interface
	 class Thread1 extends Thread
	{

	//	step:2 write run() method 
		public void run()
		{
		  for (int i = 1; i <= 10; i++)
		  { 
			System.out.println(i);
		  }
		}
	
	}
	
	class  MyThread01   
	{
		public static void main(String[] args) 
		{
			
			//main thread
			
			Thread th=Thread.currentThread();
			System.out.println(th);
			
			//step:3 create an object for above class
			Thread1 th1=new Thread1();
			
			//step:4 create a thread object and link it with our class object  which is created in step3
			Thread t1=new Thread(th1);
			System.out.println(t1);
			
			//step:5 run the thread by using thread by using start()
			t1.start();

		}

}
