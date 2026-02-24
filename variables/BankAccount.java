package com.variables;

public class BankAccount {
	
	public static int interedtrate;
	public double balance=50000;
	
	 public static void Calculate(int interedtrate, double balance) {
		 System.out.println((balance*interedtrate)/100);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount accnt1=new BankAccount();
		accnt1.interedtrate=2;
		accnt1.Calculate(accnt1.interedtrate,accnt1.balance);
		
		BankAccount accnt2=new BankAccount();
		accnt2.interedtrate=5;
		Calculate(accnt1.interedtrate,accnt1.balance); 
		Calculate(accnt1.interedtrate,accnt2.balance);
	}

}
