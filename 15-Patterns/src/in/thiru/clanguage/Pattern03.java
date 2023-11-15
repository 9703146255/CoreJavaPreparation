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
public class Pattern03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) 
		{

			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
