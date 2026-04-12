package com.multithreading;
import java.util.*;

public class CustomerThread extends Thread {
	
	public CustomerThread(BankAccount ba) {
		run(ba);
	}
	
	public void run(BankAccount ba) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit : ");
		int amt=sc.nextInt();
		ba.deposit(amt);
		System.out.println("Updated balance= " +ba.getBalance());
		System.out.println("Enter amount to withdraw : ");
		int amt2=sc.nextInt();
		ba.withdraw(amt2);
		System.out.println("Updated balance= " +ba.getBalance());
	}
	
	
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Thread th1=new CustomerThread(ba);
		th1.start();
	}
	
}
