package com.thiru.day6;

public class GPrintSquareOfEvenNoFrom1To10 {

	public static void main(String[] args) {

		int start=1,end=10;
		while(start<=end)
		{
			
			if(start%2==0)
			{
				System.out.println(start+"="+start*start);
			}
			start++;
		}
		
	}

}
