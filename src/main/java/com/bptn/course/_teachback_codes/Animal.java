package com.bptn.course._teachback_codes;


class Animal { // Superclass (parent)
	String name;

	// Parameterized constructor in the parent class
	public Animal(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Animal Name: " + name);
	}
}

class Cat extends Animal { // Subclass (child)
	int age;

	// Parameterized constructor in the child class
	public Cat(String name, int age) {
		super(name); // Calls the parent class constructor
		this.age = age; // Initializes the child class property
	}

	public void display() {
		super.display(); // Calls the parent class method
		System.out.println("Cat's Age: " + age);
	}
}


//public class Main {
//	public static void main(String[] args) {
//		Animal myDog = new Dog(); // Create a Dog object
//		myDog.animalSound(); // Call the method on the Dog object
//	}
//}
