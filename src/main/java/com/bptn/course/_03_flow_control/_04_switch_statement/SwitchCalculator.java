package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the menu!");
		System.out.println("Please choose Mobile Data plan from the list: ");
		System.out.println("1. 1GB - $10");
		System.out.println("2. 5 GB - $30");
		System.out.println("3. 10 GB - $50");
		System.out.println("4. Unlimited - $70");
		System.out.println("5. Exit");
		
		int choice = scanner.nextInt();
		
		
		switch(choice) {
			case 1: System.out.println("You have selected the 1 GB plan");
			
			
					break;
			case 2: System.out.println("You have selected the 5 GB plan");
					break;
			case 3: System.out.println("You have selected the 10 GB plan");
					break;
//			case 4: System.out.println("You have selected the 5 GB plan");
//					break;
			case 5: System.out.println("You have selected the Unlimited -$70 plan");
					break;
			default:System.out.println("Error, select form option");
		}
		
		// 1. Allow multiple selections	
		
		
		// 2. Calculate total price for the order
		
		Double Pizza = 12.99;
		Double Burger = 8.99;
		Double pasta = 9.99;
		// 3. While exiting, show the total price	
				scanner.close();

	}

}
