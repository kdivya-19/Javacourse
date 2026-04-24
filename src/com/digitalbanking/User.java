package com.digitalbanking;

public class User {
	
	private String name;
	private int number;
	Account acc;
	
	public User(String name, int number, Account acc) {
		this.name=name;
		this.number=number;
		this.acc=acc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void userDetails() {
		System.out.println("Name: "+getName());
		System.out.println("Number: "+getNumber());
		System.out.println("Account number: "+acc.getAccNumber());
		System.out.println("Balance : "+acc.getBalance());
		
		System.out.println("User accpount created successfully");
	}
	
	

}
