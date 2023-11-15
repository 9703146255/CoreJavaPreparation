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
public class MedicalItems extends ShoppingItems{

	String shopName;
	MedicalItems(){}
	MedicalItems(String name,int price,String shopName){
		this.name=name;
		this.price=price;
		this.shopName=shopName;
	}
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.shopName);
	}
	
	
	
	
	
	
}
