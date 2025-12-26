package com.scanner;
import java.util.Scanner;

 class BankApplications {
	
	private String customerName;
	private String Address;
	private long phoneNumber;
	private double balance;
	
	public BankApplications(String customerName,String Address,long phoneNumber,double balance) {
		this.customerName=customerName;
		this.Address=Address;
		this.phoneNumber=phoneNumber;
		this.balance=balance;	
	}
	
	public void deposit(int amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("Deposited amt "+amt);
		}
		else {
			System.out.println("Amount is invalid");
		}
	}
	
	public void withdraw(int amt) {
		if(amt>balance) {
			System.out.println("Amount is not sufficient");
		}
		else {
			balance-=amt;
			System.out.println("Successfully withdrawn amt "+amt);
		}
	}
	
	public void showBalance() {
		System.out.println("Available balance in your account= "+balance);
		
	}
   }
   
   
  public class BankProcessoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter your Address: ");
		String address=sc.next();
		System.out.println("Enter your phoneNumber: ");
		long number=sc.nextLong();
		System.out.println("Enter your balance: ");
		double balance=sc.nextDouble();

		BankApplications obj=new BankApplications(name,address,number,balance);
		System.out.println("Select options from below: ");
		System.out.println("1. deposit ");
		System.out.println("2. withdraw ");
		System.out.println("3. show Balance ");
		System.out.println("4. exit ");
		
		while(true) {
			System.out.println("Enter your Option from 1-4: ");
			int option=sc.nextInt();
			if(option==1) {
				System.out.println("Enter your deposit amount: ");
				int amt=sc.nextInt();
				obj.deposit(amt);
				
			}
			else if(option==2) {
				System.out.println("Enter your withdrawal amount: ");
				int amt=sc.nextInt();
				obj.withdraw(amt);
				
			}
			else if(option==3) {
				obj.showBalance();
				
			}
			else {
				System.out.println("Thank You! ");
				break;
			}
		}
		
	}
}
