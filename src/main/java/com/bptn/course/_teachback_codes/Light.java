package com.bptn.course._teachback_codes;

//No DIP - bad design
public class Light {
	public void turnOn() {
		System.out.println("The light is on");
	}
}

public class Switch {
	private Light light; // Switch depends on a specific Light class

	public Switch(Light light) {
		this.light = light;
	}

	public void operate() {
		light.turnOn(); // Switch can only turn on the light
	}
}
//The Switch class directly depends on the Light class.
//This means the Switch can only control a light.
//If you wanted to control a fan instead of a light, 
//you would have to change the Switch class, 
//which is not flexible.