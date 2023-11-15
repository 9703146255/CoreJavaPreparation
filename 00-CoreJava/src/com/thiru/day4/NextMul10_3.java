package com.thiru.day4;




public class NextMul10_3 {

	public static void main(String[] args) {
		// NextMul10_3
		int n=91;
		//int next10mul=(n+(3-n%3));     
		//System.out.println(next10mul);
		
		
		//Note:n3n3  +-%
		int nextMul9=n+(10-n%10);
		System.out.println(nextMul9);
		
		int nextMul20=n+(20-n%20);
		System.out.println(nextMul20);
	
		int nextMul30=n+(30-n%30);
		System.out.println(nextMul30);
		
		int nextMul40=n+(40-n%40);
		System.out.println(nextMul40);
		
		
		int nextMul50=n+(50-n%50);
		System.out.println(nextMul50);
		
		
		
		
		
		
		

	}

}
