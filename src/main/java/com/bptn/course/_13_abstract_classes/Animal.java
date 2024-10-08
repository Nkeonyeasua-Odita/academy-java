package com.bptn.course._13_abstract_classes;

public abstract class Animal {// abstract classes public by default same with interfaces
// Abstracte classes, they are general -  cant be instantiated directly(like a template)you can use to create child classes but cant create an object out of abstract class use 
	// Abstract Method -use when you want to create a general parent class but not
	// an object
	// has enough info , we can inherit/ extend from it
	// concrete methods - contain bodies
	// abstract bodies doesnt contain bodies- no definition
	// if we have the abstract method we have to overide/implement it using the
	// child class
	// cAbstrct- we are creating something generic in aim that itll be extended
	// Abstract Method - sound method here
	// abstract cant create an object and contain abstrect methods

	public abstract void sound(); // youre just declaring here. this will be overriden when inherited

	// concrete Method - can be overridden
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}
//data members / concrete methods we go for abstract class
//constant data and abstract methods - go for interface
//any class can extend only one class and can implement more than one interface 