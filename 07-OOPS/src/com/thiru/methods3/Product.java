package com.thiru.methods3;
/*
 3.Create "Product" class
      --instance fields
         name,price
      --Methods
         -takeInputs
         -printData
Create a main class "Shop"
        -Create Product object
        -call methods

 */
public class Product {

	String pName;
	double pPrice;
	
	void takeInputs(String l_pName, double l_pPrice )
	{
		pName=l_pName;
		pPrice=l_pPrice;
	}
	void printData()
	{
		System.out.println(pName);
		System.out.println(pPrice);
		
	}
	
	
}
