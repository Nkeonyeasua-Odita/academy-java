package com.bptn.course._14_interfaces;

interface Animal {
	void sound();
}

//this class is getting all the abstract methods, and constant values from both this interfaces at the same time
//then we have to override all the abstract
interface Pet {
	void play();
}

//whats the difference?
//there can be only abstract methods in here
//theres no way for java to have multiple inheritance
//wheere do we use an interface and abstract class ?
//abstraction used when working with normal inheritance, wen we dont need multiple inheritance

class Dog implements Animal, Pet {

	@Override
	public void play() {
		System.out.println("Woof Woof");
	}

	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}

}