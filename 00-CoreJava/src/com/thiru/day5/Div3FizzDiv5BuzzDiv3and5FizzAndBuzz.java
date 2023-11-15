package com.thiru.day5;

public class Div3FizzDiv5BuzzDiv3and5FizzAndBuzz {

	public static void main(String[] args) {
		int n=10;

       if(n%3==0) 
       {
    	   System.out.println("fizz");
       }
       else if(n%5==0)
       {
    	   System.out.println("buzz");
       }
       else if(n%3==0 && n%5==0)
       {
    	   System.out.println("fizz buzz");
       }
       System.out.println(n);
	}

}
