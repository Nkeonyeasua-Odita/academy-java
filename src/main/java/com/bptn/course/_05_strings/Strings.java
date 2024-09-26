package com.bptn.course._05_strings;

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
		
		String userName = "This is a test";
		//System.out.println(userName);
		System.out.println(userName.length()); // the lenght of the spring
		//System.out.println(userName.charAt(2));//2 here is index , s
				System.out.println(userName.substring(0,3)); // same function starts at index 2 and ends before 4
		//System.out.println(userName.trim());// takes out extra spaces on both ends but not in between helpful for scanner inputs
		System.out.println(userName.indexOf("Hello")); //This will  return -1
		
		System.out.println(userName.substring(5)); //substring is the character you want to extract 0-3

		//String message1 = "This is a test";
		
//		String s1 = new String("hi there");
//		int pos = s1.indexOf("e");
//		String s2 = s1.substring(0,pos);
//		System.out.println(s2);
//		System.out.println(s2.substring(0,4));
//		
		
		String s1 = "Hi";
		String s2 = "Bye";
		int ans1 = s1.compareTo(s2);
		System.out.println(ans1 + 4);
		
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
		
		
		
		
		
	}
}
