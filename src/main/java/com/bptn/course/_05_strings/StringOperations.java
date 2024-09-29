package com.bptn.course._05_strings;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {

		// Create scanner object
		Scanner scan = new Scanner(System.in);
		int i;
		String revInput1;
		String firstString;
		String secString;// strings declarations

		do {
			// String comparison --Print statements
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Enter the option:");
			
			// Input choice for selection of menu
			int menuSelect = scan.nextInt();

			scan.nextLine(); // clear new line

			// ask for user input in the each conditional statements for the operations
			
			switch(menuSelect) {

				case 1: 
					//Palindrome Check
					System.out.println("Palindrome Check");
					System.out.println("Enter a string:");
					firstString = scan.nextLine();
					
					revInput1 = "";// strong & empty string
					
					for (int x = firstString.length() - 1; x >= 0; x--) {
						revInput1 += firstString.charAt(x);
					} 

					if (firstString.toLowerCase().equals(revInput1.toLowerCase())) { // change the strings to all lower
																						// case and check if they're
																						// equal
						System.out.println((firstString) + " is a palindrome");
					} else {
						System.out.println(firstString + " is not a palindrome");
					}
					break;// exit the code
	
				case 2:
					// reverse a String
					System.out.print("Enter a string:");
					firstString = scan.nextLine();
					
					String reverseStrng = "";// store & empty string
					
					for (int x = firstString.length() - 1; x >= 0; x--) {
						reverseStrng += firstString.charAt(x);
						// System.out.print(reverseStrng); leaving this in this loop prints out all the
						// process eg yes,, s, se.sey
					}
					System.out.println(reverseStrng);
					break;
	
				case 3:
					//Concat two strings
	
					System.out.print("Enter First string:");
					firstString = scan.nextLine();
					System.out.print("Enter Second string:");
					secString = scan.nextLine();
	
					System.out.println(firstString + secString);// joins both string together.
					break;
	
				case 4:			
					//String Comparison
					System.out.println("String Comparison");//you need another line hear/ space
					System.out.println("Enter the first string:");
					firstString = scan.nextLine();
					System.out.println("Enter the second string:");					
					secString = scan.nextLine();					
	
					if (firstString.equals(secString)) { // using the string method to check if they're equal
						System.out.println("The entered strings are equal");
					} else {
						System.out.println("The entered strings are not equal");
					}
					break;
	
				case 5:
					// Length of String
					System.out.println("Length of a string");
					System.out.println("Enter a string:");
					firstString = scan.nextLine();					
	
					System.out.println("The length of the entered string is: " + firstString.length());// string method
																										// checks the
																										// length here
					break;
	
				default:
					// Invalid Choice
	
					System.out.println("Invalid choice! Please make a valid choice.");
				}

				System.out.println("To continue press 1, else press any other number to exit: ");
	
				i = scan.nextInt(); // input scanner for while to run true
				// while to repeat the process
			} while (i == 1);
	
				scan.close(); // close scanner
	}

}
