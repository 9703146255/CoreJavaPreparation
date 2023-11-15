package in.thiru.clanguage;

/*

1]

1
1	2 
1	2	3
1	2	3	4
1	2	3	4	5


2]
1
2	2
3	3	3
4	4	4	4
5	5	5	5	5

3]
*	
*	*
*	*	*	
*	*	*	*
*	*	*	*	*
4]
A 	
A	B
A	B	C
A	B	C	D
A	B	C	D	E

5]
1	
2	1
3	2	1
4	3	2	1
5	4	3	2	1


6]
1	2	3	4	5
1	2	3	4
1	2	3	
1	2
1
 
7] 
 1	2	3	4	5	
 2	3	4	5
 3	4	5
 4	5
 5
 
 8]
 5	
 5	4
 5	4	3
 5	4	3	2
 5	4	3	2	1
 
 
9] 
 5	4	3	2	1
 5	4	3	2
 5	4	3
 5	4
 5
 
10] 
 5	4	3	2	1
 4	3	2	1
 3	2	1
 2	1
 1
 
 
 
 */

/*
 8]
 5	
 5	4
 5	4	3
 5	4	3	2
 5	4	3	2	1
 
 */
public class Pattern11 {

	public static void main(String[] args) 
	{
		
		
		
		for (int i = 5; i >= 1; i--) 
		{
			
			for (int j = 5; j >= i; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
