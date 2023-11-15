
public class NumToStingConv {

	public static void main(String[] args) 
	{

		
		
		  int n = 22;

	        // Check if n is equal to 21
	        if (n == 21) {
	            System.out.println("twenty-one");
	        } else {
	            int n1 = n, n2 = n;
	            int b = n1 % 10, a = n2 / 10;

	            String[] singleDigit = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	            String[] twoDigit = new String[] {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	            String[] tensMultiple = new String[] {"", "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	            if (a == 1) {
	                System.out.println(twoDigit[b + 1]);
	            } else if (b == 0) {
	                System.out.println(tensMultiple[a]);
	            } else {
	                System.out.println(tensMultiple[a] + "-" + singleDigit[b]);
	            }
	        }
	}

}
