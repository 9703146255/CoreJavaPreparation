package JAVA8FullCourse1_2_3Videos;



//@FunctionalInterface it is not mandatory its optional
//advantage of this annotaion is if we dont follow rules then we will get error




// BY UING INHERITANCE CONCEPTS
@FunctionalInterface  
interface Java8_6A2 
{
		public void m1();
}


//@FunctionalInterface  
//NOW ITS NOT A FUNTIONAL INTERFACEE NOW YOU CAN USE ANY NUMBER OR ABSTRACT METHODS NO PROBLEM
interface Java8_6A1 extends Java8_6A2
{
	public void m1(); //its was overriding here from above abstract method
	
	                   //we are not used any new key word thats why its possible
	public void m2(); 
}
	



