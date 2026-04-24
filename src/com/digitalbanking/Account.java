package com.digitalbanking;



public abstract class Account {
	private final int accNumber;
	private double balance;
	private AccountType type;
	
	public Account(int accNumber, double balance, AccountType type) {
		this.accNumber=accNumber;
		this.balance=balance;
		this.type=type;
	}
	
	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amt) {
		if(amt<0 || amt>balance) {
			System.out.println("Invalid amount entered");
		}else {
			balance-=amt;
		}
		
	}
	
	public void deposit(double amt) {
		if(amt<0) {
			System.out.println("Invalid amount entered");
		}else {
			balance+=amt;
		}
		
	}

	abstract void calCharges();
	

}
