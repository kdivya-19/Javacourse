package com.multithreading;

public class BankAccount {
	
	int balance=5000;
	
	public void deposit(int amount) {

		balance+=amount;
		
	}
	public void withdraw(int amount) {
		if(amount<=0) {
			System.out.println("Invalid amount ");
		}
		else {
			balance-=amount;
			
		}
		
	}
	public int getBalance() {
		return balance;
	}
	
	
}
