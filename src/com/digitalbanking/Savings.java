package com.digitalbanking;

public class Savings extends Account {
	
	 double interestRate;
	
	public Savings(int accNumber, double balance, double interestRate) {
		super(accNumber, balance, AccountType.SAVINGS);
		this.interestRate=interestRate;
	}
	
	
	
	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	 void calCharges() {
		double bal=getBalance();
		System.out.println("Interest: "+(bal*getInterestRate())/100);
	}
	
	 public void withdraw(double amt) {
	        super.withdraw(amt);
	        System.out.println("Savings account withdrawal processed");
	    }
	
	

}
