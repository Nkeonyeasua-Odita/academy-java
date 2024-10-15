package com.bptn.course._01_variables;

//public class Main {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i);
//			if (i % 2 == 0) {
//				System.out.print(" - even");
//			}
//			System.out.println();
//		}
//		System.out.print("We love to print lines.");
//	}
//}

//public class Main {
//	public static void main(String[] args) {
//		String[] Pets = { "Dogs", "Cats", "Turtles", "Birds", "Frogs" };
//
//		for (String pet : Pets) {
//			System.out.println(pet + " make pretty good pets.");
//		}
//	}
//}

//public class Main {
//	public static void main(String[] args) {
//		int num = 1;
//
//		while (num < 10) {
//			if (num % 2 == 0) {
//				System.out.println(num + " is even");
//			} else {
//				System.out.println(num + " is odd");
//				// num++; // this was the original position move it outside the if statements
//				// if you keep in this if statement its going to continue printing the print
//				// statement 2 is even
//			}
//			num++;
//		}
//		System.out.println("I hope that helps!");
//	}
//}

public class Main {
	public class MathUtils {
		public static int add(int a, int b) {
			return a + b;
			// System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		int result = MathUtils.add(5, 3);
		System.out.println("The sum is: " + result);
	}
}