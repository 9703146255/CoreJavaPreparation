package JAVA8FullCourse1_2_3Videos;



//@FunctionalInterface it is not mandatory its optional
//advantage of this annotaion is if we dont follow rules then we will get error


interface Interff
{
		public void add(int a,int b);
		
		//public void mul(int a,int b) These the reason functioanl interfaes we have to use only one abstract method
}


public class Java8_LambdaExp03
{
	public static void main(String[] args) {
		
		
		/*Chotu I=new Chotu();     Interfa I=
		I.add(10, 20);
		*/
		
		
		//Interfa I=(int a, int b)-> System.out.println("sum of a+b is :"+(a+b)); or
		//compiler guess the datatype automatically
		Interff I=(a, b)-> System.out.println("sum of a+b is :"+(a+b));
		I.add(10, 30);
		I.add(100, 30);
		I.add(10, 300);
		
	}
}




