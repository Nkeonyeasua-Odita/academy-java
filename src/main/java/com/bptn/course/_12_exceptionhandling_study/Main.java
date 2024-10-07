package com.bptn.course._12_exceptionhandling_study;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] myNumbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		System.out.println(myNumbers[8]);
//		System.out.println("That was easy.");

		// THE CODE WITH TRY AND CATCH FOR EXCEPTION HANDLING
		try {
			int[] myNumbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
			System.out.println(myNumbers[8]);
		} catch (Exception e) {
			System.out.println("Something went wrong in numbers printing function. Error: " + e);
		}
		System.out.println("That was easy.");

		// THE CODE WITH TRY CATCH AND FINALLY STATEMENTS
		try {
			int[] myNumbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
			System.out.println(myNumbers[8]);
		} catch (Exception e) {
			System.out.println("Something went wrong in numbers printing function. Error: " + e);
		} finally {
			System.out.println("The 'try catch' block has finished.");
		}
		System.out.println("That was easy.");

	}

}
