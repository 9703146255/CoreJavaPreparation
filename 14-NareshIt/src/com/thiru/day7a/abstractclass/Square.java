package com.thiru.day7a.abstractclass;

public class Square extends Shape{
	
	private double side;

	@Override
	public void input(double... x) {
		side = x[0];
		
	}

	@Override
	public void area() {
		double areaOfSquare=side*side;
		System.out.println("Area of Square is :"+areaOfSquare);
	}
		
	}


