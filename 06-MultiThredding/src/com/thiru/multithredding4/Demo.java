package com.thiru.multithredding4;

/*
 ======================
What is Thread Life Cycle
======================

-> Thread Life cycle contains "several phases of Thread execution"

1) New  		==>  [beg its life cycle] until we can call start() method its in new state

2) Runnable		==> After calling start ( ) method

3) Running		==>	when Thread Schedular will pick up

4) Blocked 		==>	A thread is in waiting state for other thread[synchronaisation]

5) Terminated	==>A thread enters into terminated state once it completes its task.







New: A thread begins its life cycle in the new state. Thread remains in the new state until we will call start ( ) method.

Runnable : After calling start ( ) method, thread comes from new state to runnable state.

Running : A thread comes to running state when Thread Schedular will pick up that thread for execution.

Blocked  : A thread is in waiting state if it waits for another thread to complete its task.

Terminated : A thread enters into terminated state once it completes its task.


// Java Program on Thread Sleep
 * ============================
 */


public class Demo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("run() method started....");
		
		try
		{
			Thread.sleep(5000); //blocked state
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("run() method ended....");
		
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);	//new state
		t.start();				//runnable state

	}

	
}
