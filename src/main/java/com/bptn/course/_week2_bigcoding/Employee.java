package com.bptn.course._week2_bigcoding;

class Employee {
	// Instance variable to store salary
	private int salary;
	// Instance variable to store hours per day worked by employee
	private int hoursPerDay;

	// Constructor to set instance variables(salary and hoursPerDay) value
	public Employee(int salary, int hoursPerDay) {
		// this.salary = salary;
		// this.hoursPerDay = hoursPerDay;
		setSalary(salary); // Set the salary using setSalary method
		setHoursPerDay(hoursPerDay); // Set the hours per day using setHoursPerDay method
	}

	// Set method to update salary
	public void setSalary(int salary) {
		// 'this' distinguishes between the instance variable and the parameter
		// this.salary = salary;
		if (salary < 500) {
			this.salary = salary + 10; // 10
		} else {
			this.salary = salary;
		}

	}

	// Set method to update hoursPerDay
	public void setHoursPerDay(int hoursPerDay) {
		// 'this' distinguishes between the instance variable and the parameter
		// this.salary = hoursPerDay;
		if (hoursPerDay > 6) {
			this.salary += 5;// 5
		}

	}

	// Get method to return salary
	public int getSalary() {
		return salary;
	}
}
