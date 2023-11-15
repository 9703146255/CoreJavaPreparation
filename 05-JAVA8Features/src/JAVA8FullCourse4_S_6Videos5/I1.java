package JAVA8FullCourse4_S_6Videos5;



/*DEFAULT METHODS
 * ==============
 *Until 1.7V
 *==========
 *Every method present inside interface is always: public and abstract
 *void m1();
 *public void m1();
 *abstract void m1();
 *public abstract void m1();
 *
 *Related methods
 *===============
 *1.8V Default methods + Static methods
 *1.9V : Private methods
 *
 *VARAIBLES
 *=========
 *Public, Static, Final
 *
 *
 *Default methods
 *===============
 *Without effecting implementation classes if we want to add new method to the interface
 *called default method
 * 
 */

public interface I1 
{
	public void m1();
	public void m2();
	default void m3() { System.out.println("default method");}
}
class Test1 implements I1
{
    public void m1() {}
    public void m2() {}
}
class Test2 implements I1
{
   public void m1() {}
   public void m2() {}
}
class Test3 implements I1
{
    public void m1() {}
    public void m2() {}
}
class Test4 implements I1
{
    public void m1() {}
    public void m2() {}
}


