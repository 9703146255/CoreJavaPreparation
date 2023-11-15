package com.thiru.day9c.interfac.defaultmethod1;

public class Main {

	public static void main(String[] args) {
		Vehicle v;
		v = new Car(); v.run();  v.horn();  v.digitalMeter();
		v = new Bike(); v.run();  v.horn();

	}

}
