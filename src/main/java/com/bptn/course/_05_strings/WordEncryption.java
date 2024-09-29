package com.bptn.course._05_strings;

import java.util.Scanner;
public class WordEncryption {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	String word;
	int i;

	System.out.println("Enter a word to encrypt:");
	word = scan.nextLine();

	String encryptWord = "";// store encrypted string

	for (i = 0; i < word.length(); i++) {
		char wordChar = word.charAt(i);

		// lowercase letter
		if (wordChar >= 'a' && wordChar <= 'z') {
			// Shift to a if not itll be another symbol
			if (wordChar == 'z') {
				encryptWord += 'a';
			} else {
				encryptWord += (char) (wordChar + 1);
			}
		}
		// uppercase letter
		else if (wordChar >= 'A' && wordChar <= 'Z') {
			// Shift to A if not itll be another symbol
			if (wordChar == 'Z') {
				encryptWord += 'A';
			} else {
				encryptWord += (char) (wordChar + 1);
			}
		}
		// add other characters
		else {
			encryptWord += wordChar;
		}
	}

	System.out.println("Encrypted word: " + encryptWord);
	
	scan.close();

	}
}
