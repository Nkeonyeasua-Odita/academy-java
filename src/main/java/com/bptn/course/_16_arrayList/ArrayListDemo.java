package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//we work with the class by making an object out of it
//		ArrayList myList = new ArrayList();
//		//no data type was defined here
//		
//		myList.add("Hello");
//		myList.add(17);
//		myList.add(true);
//		//this is why we generics
//		ArrayList<String> myList = new ArrayList<>();//resticts with the data type
//		// you put List ..try to make as specific as possible
//		myList.add("Hello");

		// C >
		// Reserve storage for 10 items as default
		ArrayList<String> groceries = new ArrayList<>();
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Eggs");
		// R >Read
		System.out.println("Grocery List: " + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getLast());
		System.out.println(groceries.getFirst());

		// U Update
		groceries.set(1, "Coffee");
		System.out.println("Grocery List: " + groceries);
		// cant use set to increase size of list

		// D> Delete
		groceries.remove(2);
		System.out.println("Grocery List: " + groceries);

	}

}
