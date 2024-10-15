package com.bptn.course._week3_bigcoding;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();

		// Create two SumCalculator threads to calculate the sum of two different ranges
//		SumCalculator sumCalculator1 = new SumCalculator(1, 50);
//		SumCalculator sumCalculator2 = new SumCalculator(51, 100);
//		
//
//		// Start both threads
//		sumCalculator1.start();
//		sumCalculator2.start();
//
//		sumCalculator1.join();
//		sumCalculator2.join(); // putting it outside the trycath doesnt work

		SumCalculator tryone = new SumCalculator(1, 2000);
		tryone.start();
		tryone.join();

//		try {
//			// Wait for both threads to finish using join() method of each thread.
//			sumCalculator1.join();// The join() method makes one thread wait for the completion of another thread
//			sumCalculator2.join();
//		} catch (InterruptedException e) {
//			// Print the stack trace if an interruption occurs
//			e.printStackTrace();
//		}

		long endTime = System.currentTimeMillis();

		// Calculate the total sum by adding the sum of both ranges
		// int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
		// int totalSum = ;

		// Print the total sum
		System.out.println("Total sum: " + tryone.getSum());
		// Print the elapsed time
		System.out.println("Elapsed time: " + (endTime - startTime) + " ms");
	}
}
