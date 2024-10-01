package com.bptn.course._06_oop;

class SalesDepartment extends Department {
	private double totalSalesAmount;

	public SalesDepartment(String departmentName, int numberOfEmployees, double totalSalesAmount) {
		super(departmentName, numberOfEmployees);
		// TODO Auto-generated constructor stub
		this.totalSalesAmount = totalSalesAmount;

	}

}
