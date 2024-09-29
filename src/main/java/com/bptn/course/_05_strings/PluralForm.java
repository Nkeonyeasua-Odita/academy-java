package com.bptn.course._05_strings;

import java.util.Scanner;

public class PluralForm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Inputs
		System.out.print("# in: ");
		int amt = scan.nextInt();

		scan.nextLine(); // clears new line
		System.out.print("word: ");
		String word = scan.nextLine();

		// Determine the plural form of the noun based on the input
		String pluralWord;

		if (amt == 1) {
			pluralWord = word; // Singular form
			System.out.println(amt + " " + pluralWord);
		} else {
			// plural form for words ending in ay, oy,ey,uy
			if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
				pluralWord = word + "s";

			} else if (word.endsWith("y")) {

				pluralWord = word.substring(0, word.length() - 1) + "ies"; // Changes y to ies
			} else if (word.endsWith("fe")) {
				pluralWord = word.substring(0, word.length() - 2) + "ves"; // Changes fe to ves

			} else if (word.endsWith("sh") || word.endsWith("ch")) {
				pluralWord = word + "es"; // addes es y to sh,ch

			} else if (word.endsWith("us")) {

				pluralWord = word.substring(0, word.length() - 2) + "i"; // Changes us to i

			} else {
				pluralWord = word + "s"; // adds s for anyother word
			}

			// Print the result
			System.out.println(amt + " " + pluralWord); // output

			scan.close(); // Close the scanner
		}
	}
}