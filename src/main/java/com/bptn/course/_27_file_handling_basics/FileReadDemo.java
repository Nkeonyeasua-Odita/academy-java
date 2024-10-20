package com.bptn.course._27_file_handling_basics;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("student.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: " + e.getMessage());
			e.printStackTrace();
		}

	}// https://github.com/aquibajani/academy-java

}
