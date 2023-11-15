package com.thiru.day7.abstractclass;

abstract class Shape
{
	public abstract void draw();
}

class Rectangle extends Shape
{

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
		
	}
	
}

class Circle extends Shape
{

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}
	
}



public class ShapeDemo {

	public static void main(String[] args) {

		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();

	}

}
