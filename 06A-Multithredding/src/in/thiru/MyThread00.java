package in.thiru;



/*
 		Thread[main,5,main]==> Thread[thread name,thread priority,thread group name]
 
 		thread priority	==> 1 to 10
 		
 		thread group name  ==> if we want to perform some action on group of thredas
 
 
 */




public class MyThread00 {
	
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		
	}
	

}
