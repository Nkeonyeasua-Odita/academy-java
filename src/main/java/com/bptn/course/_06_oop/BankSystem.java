package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main is the starting point

		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo();
// we can create a new object 
		// this class doesnt know how it works we implemented from the Bankaccount in
		// here
		BankAccount newTestAccount = new BankAccount("123456", 600.00);
		newTestAccount.displayAccountInfo();

		SavingsAccount myAccount = new SavingsAccount("SAVINGS123", 500.00, 1.00);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
//
//		ChequingAccount myAccount = new ChequingAccount("1234", 500, 200);
//		myAccount.withdraw(300);
//		myAccount.displayAccountInfo();  check this code well sumn missing
	}

}
