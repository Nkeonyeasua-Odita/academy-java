package com.bptn.course._20_threads;

public class MultiThreadingDemo {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		MyThread t3 = new MyThread();
//
//		t1.start();
//		t2.start();
//		t3.start();
//		// allthe threads are happening/executing randomly that why the out put is
//		// random/not in order
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
//previous line your creating an object and passing MyRunnable to it
		t1.start();
		t2.start();

	}
}
//4 states a thread takes from creation to termination
//start, run, join- wait till it terminates, sleep - puts the thread in a waiting stage by putting the time .sleep(2000)
