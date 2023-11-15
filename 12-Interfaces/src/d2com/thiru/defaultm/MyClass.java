package d2com.thiru.defaultm;

public class MyClass implements I1,I2{

	public void m1()
	{
		System.out.println("m1 method of my class");
		I1.super.m1();
		I2.super.m1();
	}
	
	public static void main(String[] args) {
		
		MyClass m=new MyClass();
		m.m1();
	
	}

}
