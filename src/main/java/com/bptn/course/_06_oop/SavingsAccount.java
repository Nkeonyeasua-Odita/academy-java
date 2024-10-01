package com.bptn.course._06_oop;

class SavingsAccount extends BankAccount {

	private double interestRate;// adding one data member here

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		// super refers to the parent class
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub

	}

	public void applyInterest() {
		double interest = getBalance() * interestRate / 100;// calculating the interest
		deposit(interest);
	}

}
