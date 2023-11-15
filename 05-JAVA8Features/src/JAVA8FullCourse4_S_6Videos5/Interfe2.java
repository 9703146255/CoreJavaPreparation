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



class  p1
{
	public void m1()
	{
		System.out.println("m1 p1");
	}
}
class P2
{
	public void m1()
	{
		System.out.println("m1 p2");
	}
}
//in java we cannot extends multiple classes at atime we extends only one class at a time
//public class Interfe2 extends P1,P2
//we will get ambiguity broblem
public class Interfe2 extends p1
{
	public static void main(String[] args)
	{
		Interfe2 i=new Interfe2();
				//i.m1();
	}

}
