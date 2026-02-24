package com.inheritance3;

public class Manager extends Employee{
	public int bonus=20000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager emp1=new Manager();
		System.out.println("Total salary= "+(emp1.salary+emp1.bonus));

	}

}
