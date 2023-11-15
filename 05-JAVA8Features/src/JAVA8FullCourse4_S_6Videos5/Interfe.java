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



interface  I2
{
	default void m1()
	{
		System.out.println("RAMUDU");
	}
}


public class Interfe implements I2{
	//overriding default method
	  public void m1()
	  {
		  System.out.println("Thirumalesh");
	  }

	public static void main(String[] args) {
		Interfe i=new Interfe();
				i.m1();
	}

}
