package com.bptn.course._05_strings;

import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		
		//Read user input
		//Scanner scanner = new Scanner90
		
		//declare storage variables
		
		//convert evrything to lower case
		
		//loop through each character in the string 
		
		//check if its vowel or consonant
		
		//update the count
		
		//print the count
		
//		String userName = "This is a test";
//		//System.out.println(userName);
//		System.out.println(userName.length()); // the lenght of the spring
//		//System.out.println(userName.charAt(2));//2 here is index , s
//				System.out.println(userName.substring(0,3)); // same function starts at index 2 and ends before 4
//		//System.out.println(userName.trim());// takes out extra spaces on both ends but not in between helpful for scanner inputs
//		System.out.println(userName.indexOf("Hello")); //This will  return -1
//		
//		System.out.println(userName.substring(5)); //substring is the character you want to extract 0-3

		//String message1 = "This is a test";
		
//		String s1 = new String("hi there");
//		int pos = s1.indexOf("e");
//		String s2 = s1.substring(0,pos);
//		System.out.println(s2);
//		System.out.println(s2.substring(0,4));
//		
//		
//		String s1 = "Hi";
//		String s2 = "Bye";
//		int ans1 = s1.compareTo(s2);
//		System.out.println(ans1 + 4);
//		
		//message1.indexOf("Helypplo");// output is nothing / 0 which means st
		
		
		//you can create a character array which is like string
//		String userName = "testuser";
//		System.out.println(userName);
//		System.out.println(userName.length()); // the lenght of the spring
//		System.out.println(userName.charAt(2));//2 here is index , s
//		System.out.println(userName.substring(4)); //substring is the character you want to extract 0-3
//		System.out.println(userName.substring(2,4)); // same function starts at index 2 and ends before 4
//		System.out.println(userName.trim());// takes out extra spaces on both ends but not in between helpful for scanner inputs
//		System.out.println(userName.indexOf('r'));//Returns the index within this string of the first occurrence ofthe specified character
		
// writes a program that takes a strin as input and counts the number of vowels and consonants inthe string
		// consider both uppercase and lowercase letters
		//input: strings entered by user and ouput: the number of vowles and consonant
		
		//read user input
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		
		//declare storage variables
		int vowelCount = 0;
		int consonantCount = 0;
//		convert evrything to lowercase or upper your choice
		String lowerCaseInput = input.toLowerCase();
//		loop through each character in the string
		for(int i=0; i<lowerCaseInput.length(); i++) {//i here is for the indexes
			char ch = lowerCaseInput.charAt(i);//read character by character
//			check if its vowel or consonant
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
				// if you go straight to else execution you it will count special charcters as
				// vowel because else
				// enter condition for just alphabets
			} else if (ch >= 'a' && ch <= 'z') {// its like saying i>=1 <=10
				// update count
				consonantCount++;
			}
		}
//		print count
		System.out.println("The number of vowels are: " + vowelCount);
		System.out.println("The number of cosonants are: " + consonantCount);
	}
}
