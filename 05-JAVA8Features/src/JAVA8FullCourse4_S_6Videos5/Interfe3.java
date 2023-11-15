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



interface  Left
{
	default void m1()
	{
		System.out.println("m1 Left");
	}
}
interface Right
{
	default void m1()
	{
		System.out.println("m1 Right");
	}
}
//in java we cannot extends multiple classes at atime we extends only one class at a time
//public class Interfe2 extends P1,P2
//we will get ambiguity broblem
public class Interfe3 implements Left,Right
{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Right.super.m1();
	}
	/*// We will get error only one method can be call Interfeces PC1 OR PC2
    @Override
	public void m1() {
		// TODO Auto-generated method stub
		PC2.super.m1();
	}
	*/
	public static void main(String[] args)
	{
		Interfe3 i=new Interfe3();
		i.m1();
				//i.m1();
	}

	

}
