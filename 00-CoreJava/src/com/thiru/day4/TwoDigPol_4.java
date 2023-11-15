package com.thiru.day4;

public class TwoDigPol_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,a=11;
		x=a%10;
		a=a/10;
		y=a%10;
		if(y==x)
		{
			System.out.println("polindrome 2 dig num");
		}
		else {
			System.out.println("not a polindrome num");
		}
	

	}

}
