package singletoneclass;

/*
 * SINGLETONE CLASS
 * ================

 *  SINGLETONE CLASS:
 *  ----------------
 *  For any java class if we are allow to create 
 *  only one object called singletone class. similar kind of requirement and
 *   re-use that requirement
 *  
 *  Create one object and reuse 100 members(3lacks)
 *  
 *  or 
 *  
 *  If several peoples have same requirement than it is not recommended to create seperate object
 *  for every requirement we have to create one object and than we can re-use same object
 *  
 *  ex: *
 *  Runtime 
 * Business deligate
 * Serivice Locator
 * Action servlet
 * 
 * Advantage of singletone class
 * ==============================
 * Performace improvement  
 * Memory improvement 
 * 
 * 
 * APPROACH 1(HOW TO CREATE A SINGLETONE CLASS)
 * We can create our own singletone classes for this we have to use
 * private construcor 
 * private static variable
 * ana public factory method
 * 
 * 
 * At any point of time for test class we can create one object 
 * hence test class is singletone class
 */


class Test1
{
	//private static variable
	private static Test1 t=null;            //Test1 t=null;
	
	
	//private constructor
	private Test1()
	{
		
	}
	
	//public factory method
	public static Test1 getTest1()
	{
		//first time we have to create object  ==> First time only true
		//next time don't create object here just return existing object
		if(t==null)
		{
			t=new Test1();
		}
		return t;
	}
}
public class singletoneclass3 {

	public static void main(String[] args) {
															//WE CAN RE-USE THIS OBJECT
		Test1 r1=Test1.getTest1();                    //==========
		Test1 r2=Test1.getTest1(); 					//||	   ||
		Test1 r3=Test1.getTest1();					//||OBJ    ||
		Test1 rn=Test1.getTest1();					//||========
	}

}
