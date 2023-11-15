package com.thiru.interfaces;
/*


	public void copy();
	public void paste();
	public void cut();
	public void keyBoard();
	default Security();
	static audio();
	private commonCode();


*/
public class Hp implements Laptop{

	@Override
	public void copy() {
		System.out.println("Hp copy method");
		
	}

	@Override
	public void paste() {
		System.out.println("Hp paste method");
		
	}

	@Override
	public void cut() {
		System.out.println("Hp cut method");
		
	}

	@Override
	public void keyBoard() {
		System.out.println("Hp keyBoard method");
		
	}
	//////////////////////// method is added
	public void printing() {
		System.out.println("Hp printing method");
		
	}

}
