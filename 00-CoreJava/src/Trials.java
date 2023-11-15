import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Trials {

	public static void main(String[] args) {

	List<Integer> l=Arrays.asList(1,2,5,10,20);	
	Optional<Integer>  sum=l.stream().reduce((a,b)->a+b);
	System.out.println("sum of the numbers :"+sum.get());
	}

}
