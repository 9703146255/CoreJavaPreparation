package in.thiru.clanguage;

/*
 i==> rows
 j==> columns
 
 
print(i)
11111
22222
33333
44444
print(j)
12345
12345
12345
12345
 
 */
public class Pattern05 {

	public static void main(String[] args) {
		 for (char c = 'a'; c <= 'e'; c++) {
			 
			 for (char d = 'a'; d <= 'e'; d++) 
			 {
			 
	            System.out.print(c + " ");
	          }
			 System.out.println();

	}

}}
