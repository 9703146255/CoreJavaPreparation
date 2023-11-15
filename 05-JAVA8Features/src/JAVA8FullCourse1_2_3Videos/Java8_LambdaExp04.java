package JAVA8FullCourse1_2_3Videos;

interface Parent
{
	//we are using return type
		public int squareIt(int n);
}
public class Java8_LambdaExp04
{
	public static void main(String[] args) {
		
	//	Parent I=(b)->System.out.println("square of the number is:"+(b*b));
	//	I.squareIt(20);
		
		
		Parent p= n->n*n;
		System.out.println("The square of the number is:"+p.squareIt(10));
		System.out.println("The square of the number is:"+p.squareIt(100));
		//Lambda expressions are commonly used common coding if we know
		
	}
}




