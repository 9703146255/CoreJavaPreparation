package no14com.thiru.methodoverriding2;
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
public class ElectricalItems extends ShoppingItems{

	  String shopName;
	  ElectricalItems(){}
	  ElectricalItems(String name,int price,String shopName)
	  {
		  this.name=name;
		  this.price=price;
		  this.shopName=shopName;
	  }
	  protected  void printData()
	  {
		  System.out.println(this.name);
		  System.out.println(this.price);
		  System.out.println(this.shopName);
	  }
}
