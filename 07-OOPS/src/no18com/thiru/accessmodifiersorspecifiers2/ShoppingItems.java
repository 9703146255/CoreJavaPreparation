package no18com.thiru.accessmodifiersorspecifiers2;


/*
same scope[protected == protected]
===================================
ShoppingItems		==>	[ super class ] protected
MedicalItems		==>	[	sub class ] protected 


increases scope[default ==> protected]
======================================
ShoppingItems		==>	[ super class ] default
ElectricalItems		==>	[	sub class ] protected 

 */
public class ShoppingItems {
	String name;
	int price;

	ShoppingItems(){}
	ShoppingItems(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
    void printData()
    {
    	System.out.println(this.name);
    	System.out.println(this.price);
    }




}
