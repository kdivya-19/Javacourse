package com.digitalbanking;
import java.util.*;

enum AccountType {
    SAVINGS, CURRENT
}

enum TransactionStatus {
    SUCCESS, FAILED, PENDING
}

class Transactions {
	private static int counter = 1;
	private int transactionId;
	private double amt;
	private TransactionStatus status;
	
	
	
	public Transactions(double amt) {
		this.transactionId=counter++;
		this.amt=amt;
		this.status=TransactionStatus.PENDING;
		
	}
	
	
	void completeTransaction() {
		status=TransactionStatus.SUCCESS;
	}
	
	void failTransaction() {
		status=TransactionStatus.FAILED;
		
	}
	
	
	
	public int getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}


	public double getAmt() {
		return amt;
	}


	public void setAmt(double amt) {
		this.amt = amt;
	}


	


	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getTransactionId()).append(getAmt()).append(status);
		return sb.toString();
	}
	
	class Validator{
		boolean validate() {
			return amt>0;
		}
	}
}

interface PaymentService {
	
	 void sendMoney(double amt);
	 void receiveMoney(double amt);
}



class BankService implements PaymentService {
	 
	private Account acc;
	
	public BankService(Account acc) {
		this.acc=acc;
		
	}
	
	

	 public void sendMoney(double amt) {
		 
		 Transactions t=new Transactions(amt);
		 Transactions.Validator v=t.new Validator();
		 if(v.validate()) {
			 if(acc.getBalance()>0) {
				 acc.withdraw(amt);
				 t.completeTransaction();
				 System.out.println("complete Transaction");
			 }
		 }else {
			 t.failTransaction();
			 System.out.println("Failed Transaction");

		 }
		 System.out.println(t);
		 
		 
		
	}
	
	public void receiveMoney(double amt) {
		Transactions t=new Transactions(amt);
		 Transactions.Validator v=t.new Validator();
		 if(v.validate()) {
			 if(acc.getBalance()>0) {
				 acc.deposit(amt);
				 t.completeTransaction();
				 System.out.println("complete Transaction");
			 }
		 }else {
			 t.failTransaction();
			 System.out.println("Failed Transaction");

		 }
		 System.out.println(t);
	}
}




public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exists=true;
		
		System.out.println("--------MENU DRIVEN-----------");
		System.out.println("1. Send Money \n 2. Receive Money \n 3. View Balance \n 4.Exit ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your number");
		int number=sc.nextInt();
		
		System.out.println("Enter your account number");
		int acc=sc.nextInt();
		
		System.out.println("Enter your intial balance");
		double bal=sc.nextDouble();
		
		System.out.println("Enter your intial interest rate");
		int rate=sc.nextInt();
		
		Savings account1=new Savings(acc, bal, rate);
		
		
		
		User user1=new User(name, number, account1);
		
		BankService bs=new BankService(account1);
		while(exists) {
			
			System.out.println("Enter your option:");
			
			int choice=sc.nextInt();
			switch(choice) {
				
			case 1 :
				System.out.println("Enter amount for withdrawal:");
				int amt=sc.nextInt();
				bs.sendMoney(amt);
				break;
				
			case 2:
				System.out.println("Enter amount to depositt:");
				int amt2=sc.nextInt();
				bs.receiveMoney(amt2);
				break;
			
			case 3:
				System.out.println(account1.getBalance());
				break;
				
			case 4:
				System.out.println("Thank You!");
				exists=false;
				break;
				
			}
			
			
			
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
