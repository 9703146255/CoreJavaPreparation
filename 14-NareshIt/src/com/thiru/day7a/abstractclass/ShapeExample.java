package com.thiru.day7a.abstractclass;

import java.util.Scanner;

public class ShapeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s;
		
		s = new Rectangle();
		System.out.print("Enter the length of the Rectangle :");
		double length = sc.nextDouble();
		System.out.print("Enter the breadth of the Rectangle :");
		double breadth = sc.nextDouble();
		s.input(length, breadth);
		s.area();
		
		s = new Square();
		System.out.print("Enter the Side of the Square :");
		double side = sc.nextDouble();
		s.input(side);
		s.area();
		
		s = new Circle();
		System.out.print("Enter the Radius of the Circle :");
		double radius = sc.nextDouble();
		s.input(radius);
		s.area();

	}

}
