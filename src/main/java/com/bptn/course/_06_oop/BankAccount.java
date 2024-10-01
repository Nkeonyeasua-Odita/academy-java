package com.bptn.course._06_oop;

class BankAccount {
	// Data Members/ properties
	private String accountNumber;
	private double balance; // these are just declared

	// Construtor-u
	public BankAccount(String accountNumber, double initialBalance/* this is parameter */) {// what we want o read from
																							// the user
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	// this refers to the calling of the current object. it take the object thats
	// calling that number?
	// eg accountTwo.accountNumber = acccountNumber

	// Instance Method, Class Method, Behaviour of the class
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Getter and setters
	public double getBalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}// 4 methods
}