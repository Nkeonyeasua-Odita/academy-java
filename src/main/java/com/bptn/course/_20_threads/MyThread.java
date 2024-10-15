package com.bptn.course._20_threads;

public class MyThread extends Thread {// thsi will create one process for us then we override
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}
	}

}
