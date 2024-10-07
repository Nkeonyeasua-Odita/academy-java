package com.bptn.course._04_arrays;

public class MultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2D ARRAYS
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(myNumbers[1][2]);
		// the output will be 7 because [a][b]
		// [a] refers to the 2nd array{}-- index 1,
		// [b] refers to the value/ element index 2 which is 7
		System.out.println(myNumbers[0][2]);
		System.out.println(myNumbers[1][0]);
		// to change element value to another value
		System.out.println(myNumbers[0][3]);

		myNumbers[0][3] = 9;
		System.out.println(myNumbers[0][3]);
		System.out.println("\nFor Loop side");
		// for loop

		for (int i = 0; i < myNumbers.length; ++i) { // this is for the outer loop(1st row) i=0, i=1
			for (int j = 0; j < myNumbers[i].length; ++j) { // this is for the inner loop
			    System.out.print(myNumbers[i][j]);
				// examples gotten from w3school
				// the output is similar when its post and pre increment

			}
		}
	}

}
