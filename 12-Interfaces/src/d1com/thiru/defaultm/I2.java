package d1com.thiru.defaultm;

public interface I2 {
	
	 default void commonMethod()
	 {
		 System.out.println("default method from I2");
	 }

}
