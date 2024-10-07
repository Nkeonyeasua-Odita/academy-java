package com.bptn.course._12_exceptionhandling;

public class Main {
	public
	int[] numbers = {0, 2, 3, 4, 5};try
	{
		// code that might throw an exception
		// int result = 10 / numbers[1];
		System.out.println("Result: " + result);
//		int result = 10/0;
//		System.out.println("Result: " + result);
	}catch(
	ArithmeticException e)
	{
		// code to handle the exception
		System.out.println("Cannot divide by zero");

	}catch(
	ArrayIndexOutOfBoundsException e)
	{
		// code to handle the exception
		System.out.println("Array only contains " + numbers.length + "items");
	}finally
	{
		// code will always run
		System.out.println("Program ended");
	}
}
