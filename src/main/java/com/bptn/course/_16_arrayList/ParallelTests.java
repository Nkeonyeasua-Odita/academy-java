package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class ParallelTests {
	public static void main(String[] args) {
		ArrayList<Integer> test1Grades = new ArrayList<Integer>();
		ArrayList<Integer> test2Grades = new ArrayList<Integer>();
		test1Grades.add(100);
		test2Grades.add(100);
		test1Grades.add(80);
		test2Grades.add(70);
		test1Grades.add(70);
		test2Grades.add(90);
		double total = 0;
		for (int i = 0; i < test1Grades.size(); i++) {

			System.out.println("Test 1, Grade " + i + ": " + test1Grades.get(i));
			System.out.println("Test 2, Grade " + i + ": " + test2Grades.get(i));

			total += test1Grades.get(i) + test2Grades.get(i);
			System.out.println("Current total after adding grades: " + total);
		}
		int numberOfGrades = test1Grades.size() * 2;
		System.out.println("Number of grades: " + numberOfGrades);
		System.out.println("Average over two tests: " + total / numberOfGrades);
	}
}