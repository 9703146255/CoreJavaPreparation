package com.thiru.day8a.interfac;

public class Main {

	public static void main(String[] args) {
		Movable m = new Car();
		m.move();
		System.out.println("My Car speed is :"+Movable.SPEED);

	}

}
