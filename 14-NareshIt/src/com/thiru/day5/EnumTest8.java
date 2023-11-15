package com.thiru.day5;

enum MyType 
{
ONE 
{
	@Override
    public String toString() 
	{
        return "this is one";
    }
},
 
TWO 
{
	@Override
    public String toString() 
	{
        return "this is two";
    }
},

THIRU 
{
	@Override
    public String toString() 
	{
        return "this is thiru";
    }
}
}
public class EnumTest8 {

	public static void main(String[] args) {
		System.out.println(MyType.ONE);
		System.out.println(MyType.TWO);
		System.out.println(MyType.THIRU);

	}

}
