package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new array list called my books

		ArrayList<String> myBooks = new ArrayList<>();
		// Add 3 fav books or book 1 , book 2..
		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());
		// display all books
		System.out.println("My Books are: " + myBooks);
//		myBooks.add("Dark Matter");
//		myBooks.add("Charlie and the Chocolate Factory");
//		myBooks.add("Book3");
		for (String book : myBooks) {
			System.out.println("Book:" + book);
//			System.out.println("Book:" + counter + ":" + book);
//			counter++;
		}

		// Display the first book
		System.out.println(myBooks.get(0));// can use get firt too
		// System.out.println(myBooks[1]);

		// Display 2nd book
		myBooks.remove(1);
		System.out.println("Book:" + myBooks);

		// Search for book
		// contains method returns a boolean
		if (myBooks.contains("Book1".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}

		System.out.println("Book:" + myBooks.size());
		System.out.println("Book:" + myBooks.get(myBooks.size() - 1));



	}

}
