package JAVA8FullCourse4_S_6Videos5;

/*Default methods
==============
Without effecting implementation classes if we want to add new method to the interface
called default method

multiple inheritence
====================

p1-> class            p2-> class
      m1()                m1()

            Test-> class extends p1,p2
           c.m1

ambiguity problem

*/



interface  Interfs
{
	public static void m1()
	{
		System.out.println("interface static method");
	}
}

//in java we cannot extends multiple classes at atime we extends only one class at a time
//public class Interfe2 extends P1,P2
//we will get ambiguity broblem
public class Interfe4 implements Interfs
{
	public static void main(String[] args) {
		Interfs.m1();  //1
		//  m1();       //2)
		//Interfe4.m1()  //3) 
		// Interfe4 if=new Interfe4(); //4) 
		//t.m1();
		//we can call only by using interface name only
	}
	

	

}
