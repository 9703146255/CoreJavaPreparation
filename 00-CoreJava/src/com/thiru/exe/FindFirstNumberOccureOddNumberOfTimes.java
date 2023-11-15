package com.thiru.exe;
//Find the first number occurring odd number of times in an array. (1,2,1,2,4,5,6,6,5,4,2, 4 O/P: 2)
public class FindFirstNumberOccureOddNumberOfTimes {

	public static void main(String[] args) {

		int[] array= {1,4,4,3,1};

		for(int i=0;i<array.length ;i++)
		{
			int count=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
				}

			}
			
			if(count%2==1)
			{
				System.out.println(array[i]);
				break;
			}

		}


	}

}
