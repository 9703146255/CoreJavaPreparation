package JAVA8FullCourse1_2_3Videos;



/*
 * 
 * 
 * @FunctionalInterface
 * ====================
 * it is not mandatory its optional.
 * advantage of this annotaion is if we don't follow FI rules then we will get error
 * 
 * FUNCTIONAL INTERFACE
 * ====================
 * An interface which is having only one abstract method
 * we can take any no of Default methods 
 * we can take any no of static methods
 */



//NOTE : AB1 , STATIC ..N, DEFAULT.. N  

@FunctionalInterface  
public interface Java8_4 {
	

public void m1();       



public static void Sm1() { }    //AKRM
public static void SM2() { }  //any number of static methods
public static void Sm3() { }


default void dm3() {}  
default void dm4() {}	 //any number of default methods we should take
default void dm5() {}
}



