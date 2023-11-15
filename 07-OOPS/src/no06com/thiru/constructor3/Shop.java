package no06com.thiru.constructor3;

public class Shop {

	public static void main(String[] args) {
		System.out.println("********************************");
		Product pdct1=new Product("Horlicks", 200);
		pdct1.printData();
		
		System.out.println("********************************");
		Product pdct2=new Product("Shoes", 500);
		pdct2.printData();
		System.out.println("********************************");

	}

}
