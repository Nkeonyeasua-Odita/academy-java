package com.bptn.course._03_flow_control._03_if_statement;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner scan = new Scanner(System.in);
			int i;
			double firstNum, secNum;
			
		do {

			// Calculator Menu --Print statements
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to square a number");
			System.out.println("Press 6 to find a square root");
			System.out.println("Press 7 to find the reciprocal");

			// Input choice for selection of menu
			int menuSelect = scan.nextInt();
			
			// ask for user input in the each conditional statements for the operations

				if (menuSelect ==1){
					//ADDITION
					System.out.print("Enter the first number: ");
					firstNum = scan.nextDouble();
					System.out.print("Enter the second number: ");
					secNum = scan.nextDouble();
					
					double sum = firstNum + secNum;// sum of the numbers input
					System.out.println("The addition of the numbers " +firstNum +" and " + secNum + " is = " + sum );

					
				}else if (menuSelect ==2){
					//subtraction
					System.out.print("Enter the first number: ");
					firstNum = scan.nextDouble();
					System.out.print("Enter the second number: ");
					secNum = scan.nextDouble();
					
					double subtNum = firstNum - secNum;// difference of the numbers input
					System.out.println("The product of the numbers " +firstNum +" and " + secNum + " is = " + subtNum );
					
					
				}else if (menuSelect ==3) {
					//multiplication
					
					System.out.print("Enter the first number: ");
					firstNum = scan.nextDouble();
					System.out.print("Enter the second number: ");
					secNum = scan.nextDouble();
					
					double multNum = firstNum * secNum;// product of the numbers input
					System.out.println("The product of the numbers " +firstNum +" and " + secNum + " is = " + multNum );
					
				}else if (menuSelect ==4) {
					//division 
					System.out.print("Enter the first number: ");
					firstNum = scan.nextDouble();
					System.out.print("Enter the second number: ");
					secNum = scan.nextDouble();
 
					double divNum = firstNum / secNum;
					double moduNum = firstNum % secNum;
					System.out.println("Dividing " +firstNum +" by " + secNum + " the quotient is " + divNum );//checthis
					System.out.println("The remainder is " + moduNum);
					
					
				}else if (menuSelect ==5) {
					//square of a number
					System.out.print("Enter the number to find Square: ");
					firstNum = scan.nextDouble();
					double sqrNum = firstNum * firstNum;
					
					System.out.println("The Square of the number " + firstNum + " is = " + sqrNum);
					
				}else if (menuSelect ==6) {
					// find square root
					System.out.print("Enter the number to find Square root: ");
					firstNum = scan.nextDouble();
					double sqrtNum = Math.sqrt(firstNum);

					System.out.println("The Square root of the number " + firstNum + " is = " + sqrtNum);

				}else if (menuSelect ==7) {
					// reciprocal == 1/input
					
					System.out.print("Enter the number to find Reciprocal: ");
					firstNum = scan.nextDouble();
					double reciNum = 1 / firstNum;

					System.out.printf("The Reciprocal of the number %.1f is = %.18f%n", firstNum, reciNum);

				} else if (menuSelect == 0) {
					System.out.println("Invalid choice! Please make a valid choice.");

				} else {
					break;
				} // default -- to exit/stop the code
						
				System.out.println("To continue calculation press 1, else press any other number to exit: ");
	           
				i = scan.nextInt(); //input scanner for while to run true
				// while to repeat the process
			} while (i == 1);
				
			scan.close(); // close scanner
			
	}

}
