package singletoneclass;

/*
 * SINGLETONE CLASS
 * ================

 *  SINGLETONE CLASS:
 *  ----------------
 *  For any "java class" which is used to create only one object called singletone class. similar kind of requirement and
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
 * Service Locator
 * Action servlet
 * 
 * Advantage of singletone class
 * ==============================
 * Performace improvement  
 * Memory improvement 
 */

public class singletoneclass {

	public static void main(String[] args) {
															//WE CAN RE-USE THIS OBJECT
		Runtime r1=Runtime.getRuntime();                    //==========
		Runtime r2=Runtime.getRuntime(); 					//||	   ||
		Runtime r3=Runtime.getRuntime();					//||OBJ    ||
		Runtime r4=Runtime.getRuntime();					//||========
	}

}
