package com.bptn.course._27_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("student.txt", true);
			writer.write("This is a new file!");
			System.out.println("File Created!");
			writer.close();

		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
