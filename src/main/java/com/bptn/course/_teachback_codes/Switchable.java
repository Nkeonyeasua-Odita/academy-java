package com.bptn.course._teachback_codes;

//Using DIP
//Abstraction: Switchable Interface
public interface Switchable {
	void turnOn();// defining the methods
}

//Low-level module: Light class
public class Light implements Switchable {
	public void turnOn() {
		System.out.println("The light is on");
	}
}

//Low-level module: Fan class
public class Fan implements Switchable {
	public void turnOn() {
		System.out.println("The fan is on");
	}
}

//High-level module: Switch class
public class Switch {
	private Switchable device; // Switch depends on an abstraction, not a specific class

	public Switch(Switchable device) {
		this.device = device;
	}

	public void operate() {
		device.turnOn(); // Switch can now control any Switchable device
	}
}

//We created a Switchable interface that represents any device that can be turned on.
//Both Light and Fan implement the Switchable interface, meaning they can be turned on, but they do it in their own way.
//The Switch class now depends on the Switchable interface (the abstraction), not on a specific class like Light.
//Now, the Switch can control any device that implements Switchable, whether it’s a Light, Fan, or something else.