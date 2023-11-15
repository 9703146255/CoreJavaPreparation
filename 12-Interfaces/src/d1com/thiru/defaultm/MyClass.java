package d1com.thiru.defaultm;

public class MyClass implements I1,I2{
	
	@Override
    public void commonMethod() {
        // Call the default method from Interface1
        I1.super.commonMethod();
        I2.super.commonMethod();
    }

	public static void main(String[] args) {
		
			MyClass myClass = new MyClass();

	        // Call the overridden commonMethod in MyClass
	        myClass.commonMethod();
	}

}
