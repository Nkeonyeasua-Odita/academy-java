package com.bptn.course._06_oop;

class Department {
//
	private String departmentName;
	private int numberOfEmployees;

	public Department(String departmentName, int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
		this.departmentName = departmentName;
	}

	public void departmentinfo() {
		System.out.println("Name of department" + departmentName);
		System.out.println("Number of employees" + numberOfEmployees);
	}
}
