package com.bptn.course._teachback_codes;

class Parent {
	int value = 100;
}

class Child extends Parent {
	int value = 200;

	public void showValue() {
		System.out.println("Child Value: " + value);
		System.out.println("Parent Value: " + super.value); // Access Parent's value
	}
}