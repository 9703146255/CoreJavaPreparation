package com.thiru.day5;
enum Season1   
	{
	   SPRING("Pleasant"), SUMMER("UnPleasent"), RAINY("Rain"), WINTER;

       String msg;
	  
	    Season1(String msg)
		{
		  this.msg = msg;
		}

		Season1()
		{
			this.msg = "Cold";
		}

		public String getMessage()
		{
			return msg;
		}
	}
public class EnumTest9 {

	public static void main(String[] args) {
		Season1 s1[] = Season1.values();

		for(Season1 x : s1)
			System.out.println(x+"  is :"+x.getMessage());
	}

}
