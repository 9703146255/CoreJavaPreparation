package com.thiru.emphasis;

public class ExceptionPriorityExample {

	public static void main(String[] args) {
		 try {
	            divide(10, 0);
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException occurred: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException occurred: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }

	    public static void divide(int num1, int num2) {
	        if (num2 == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        int result = num1 / num2;
	        System.out.println("Result: " + result);

	}

}
