package com.bptn.course._06_oop;

class ChequingAccount extends BankAccount {
	private double overDraftLimit;

	// add the constructor nextprivate double
	public ChequingAccount(String accountNumber, double initialBalance, double overDraftLimit) {
		super(accountNumber, initialBalance);
		this.overDraftLimit = overDraftLimit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= (getBalance() + overDraftLimit)) {
			super.withdraw(amount);
		}
	}

}
