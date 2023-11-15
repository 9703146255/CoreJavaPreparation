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
 * Advantage of singletone class(pm)
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
 */


class Test
{
	//private static variable
	private static Test t=new Test();                      //Test t=new Test();
	
	//private constructor
	private Test()
	{
		
	}
	//public factory method
	public static Test getTest()
	{
		return t;
	}
}
public class singletoneclass2 {

	public static void main(String[] args) {
															//WE CAN RE-USE THIS OBJECT
		Test r1=Test.getTest();                    //==========
		Test r2=Test.getTest(); 					//||	   ||
		Test r3=Test.getTest();					//||OBJ    ||
		Test rn=Test.getTest();					//||========
	}

}
