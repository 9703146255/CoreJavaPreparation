package com.thiru.exe;

public class FirstNonDuplicateCharacter {

	//Find the first non-duplicate character in a String (E.g Apple – ‘A’; Madam – ‘D’)
	//Find the first number occurring odd number of times in an array. (1,2,1,2,4,5,6,6,5,4,2, 4 O/P: 2)
	public static void main(String[] args) {

		
		//String name="Apple";
	String name="Madam";
		name=name.toUpperCase();
		char[] x=name.toCharArray();
		int size=x.length;
		
		for(int i=0;i<size;i++)	
		{
			boolean unique=true;
			for(int j=0;j<size;j++)
			{
				
				if(i != j && x[i] == x[j])
				{
					unique=false;
					break;
				}
			}
			
			if(unique==true)
			{
				System.out.println(x[i]);
				
			}
		}
		
}

}
