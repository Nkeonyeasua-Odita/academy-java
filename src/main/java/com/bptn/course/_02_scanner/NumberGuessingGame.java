package com.bptn.course._02_scanner;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int targetNumber = 23;// for test case
		int guess;
		
		System.out.println("targetNumber: " + targetNumber);

		do {
			System.out.print("guess: ");
			guess = scan.nextInt(); // get user input

			if (guess < 1) { // puting a range
				System.out.println("Please enter a number between 1 and 100.");

			} else if (guess > targetNumber) {
				System.out.println("Too high! Try again.");

			} else if (guess < targetNumber) {
				System.out.println("Too low! Try again.");

			} else if (guess > 100) { // putting a range
				System.out.println("Please enter a number between 1 and 100.");

			} else { // if correct
				System.out.println("Congratulations! You guessed the number correctly!");
			}

		} while (guess != targetNumber); // loops until guess is correct

		scan.close();
	}

}
