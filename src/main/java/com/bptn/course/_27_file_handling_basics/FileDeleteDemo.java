package com.bptn.course._27_file_handling_basics;

public class FileDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.io.File;


		public class FileDeleteDemo {


		 public static void main(String[] args) {


		  File file = new File("sample.txt");


		  if (file.exists()) {
		   System.out.println("File found! Deleting now..");
		   if (file.delete()) {
		    System.out.println("File deleted!");
		   }
		  } else {
		   System.out.println("File not found!");
		  }


		 }


		}

	}

}
