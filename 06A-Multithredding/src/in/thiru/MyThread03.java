package in.thiru;



/*


setting the thread name by default thread-1 we have

	Thread t1=new Thread(th1);
	t1.setName("thiru-1");
	
	Thread[main,5,main]
	Thread[thiru-1,5,main]

 */





	 class Thread3 extends Thread
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
	
	class  MyThread03   
	{
		public static void main(String[] args) 
		{
			
			//main thread
			
			Thread th=Thread.currentThread();
			System.out.println(th);
			
			//CHILD THREAD1
			Thread3 th1=new Thread3();
			Thread t1=new Thread(th1);
			t1.setName("thiru-1");		//XXXXXXXXXXXXXX
			System.out.println(t1);
			t1.start();
			
			
			//CHILD THREAD1
			Thread3 th2=new Thread3();
			Thread t2=new Thread(th2);
			t2.setName("thiru-2");		//XXXXXXXXXXXXXX
			System.out.println(t2);
			t2.start();

		}

}
