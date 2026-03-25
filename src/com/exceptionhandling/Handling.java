package com.exceptionhandling;

public class Handling {
	
	public static void tiMethod(int n){
		
		try {
			System.out.println(1000);
			tilMethod(n);
			System.out.println("Coders \n");
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	
	
	public static void tilMethod(int n) {
		
		try {
			if(n==0) {
				System.out.println(10000/n);
			}
			else if(n==10) {
				throw new ArithmeticException("Exception");
			}
			
			else {
				System.out.println("Completed");
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("Finally");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Handling().tiMethod(0);
		
		new Handling().tiMethod(1);
		new Handling().tiMethod(10);
		new Handling().tiMethod(15);
	}
	

}
