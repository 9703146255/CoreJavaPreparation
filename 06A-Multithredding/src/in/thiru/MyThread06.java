package in.thiru;



/*


setting the thread name by default thread-1 we have

	Thread t1=new Thread(th1);
	t1.setName("thiru-1");
	
	Thread[main,5,main]
	Thread[thiru-1,5,main]
	
	THREAD - 4==> WE ARE SETTING THE THREAD NAMES HERE
	
	
	THREAD - 5==>Setting the priority to the threads here[we assumed that highest priority thread will execute first but not following like that
				 its follows actually highest priority thread will execute first
				-->setPriority(Field/priority)
				
				-->MAX_PRIORITY			==>		10
				
				-->NORM_PRIORITY		==>		5[BY-DEFAULT]
				
				-->MIN_PRIORITY			==>		0
				
				EX: tr.setProperty(1);
					 tr.setProperty(3); ....
					 
				(OR)	 
					 
					tr.setProperty(Thread.MAX_PRIORITY);
					 
					tr.setProperty(Thread.MIN_PRIORITY);
					
					//set
					t2.setPriority(Thread.MAX_PRIORITY);	
					t1.setPriority(3);
					
					//got o/p
					Thread[thiru-1,3,main]
					Thread[thiru-2,10,main]
	THREAD - 6:here checking where our main thread is ending	
	
	THREAD - 7: sleeping of thread execution or suspending for some time
	
					sleep(milliseconds)			//sleeping main thread for to execute remaining loops
					
					suspend() ==> music start or resume() ==>music stop
	
					suspend(), resume() these are deprecated methods[deprecated ==> not recommended to use it will removed in future versions]
					
					or 
					
					wait()
					notify()
					notifyAll()
	
					 
					 
	

 */





	 class Thread6 extends Thread
	{
		 
		 String name;
		 
		 Thread6(String name)
		 {
			 this.name=name;
		 }
		 
		 
		 

	//	step:2 write run() method 
		public void run()
		{
		  for (int i = 1; i <= 10; i++)
		  { 
			System.out.println(i+" : "+this.name);
		  }
		}
	
	}
	
	class  MyThread06   
	{
		public static void main(String[] args) 
		{
			
			//main thread
			
			Thread th=Thread.currentThread();
			System.out.println(th);
			
			//CHILD THREAD1
			Thread6 th1=new Thread6("cd-1");
			Thread t1=new Thread(th1);
			t1.setName("thiru-1");		
			t1.setPriority(3);			
			System.out.println(t1);
			t1.start();
			
			
			//CHILD THREAD1
			Thread6 th2=new Thread6("cd-2");
			Thread t2=new Thread(th2);
			t2.setName("thiru-2");		
			t2.setPriority(Thread.MAX_PRIORITY);			
			System.out.println(t2);
			t2.start();
			
			
			
			try {
				th.sleep(10000);
			} catch (InterruptedException e) {			//XXXXXXXXXXXXXX i am stoping main thread here for some time
				e.printStackTrace();
			}
			
			
			
			
			System.out.println("ending main thread here............");

		}

}
