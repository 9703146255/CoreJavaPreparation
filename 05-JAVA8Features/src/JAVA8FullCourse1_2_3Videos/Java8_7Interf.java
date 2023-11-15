package JAVA8FullCourse1_2_3Videos;



//@FunctionalInterface it is not mandatory its optional
//advantage of this annotaion is if we dont follow rules then we will get error


//FUNCTIONA INTERFACE USING NORMAL WAY
interface Intrf
{
		public void m1();
}

//IMPLEMENTING FUNCTIONAL INTERFACE
class Demo implements Intrf
{

	public void m1() {
		System.out.println("hello hi................");
		}
}


/*
()-> System.out.println("hello hi................");


 */




public class Java8_7Interf
{
	public static void main(String[] args) {
		
		
		//Demo d=new Demo();
		//PARENT I=new child();
		
		
		Intrf i=new  Demo();
				i.m1();
		//NORMAL WAY WE ARE CREATING OBJECT AND CALLIG HERE
		
	}
}




