package com.exceptionhandling;

public class Example4 {
	public static void data(int n) throws Exception {
		if(n==0) {
			throw new Exception("Not allowed zeroes");
		}else if(n<0) {
			throw new Exception("-ve values Not allowed zeroes");
		}else {
			System.out.println(n);
		}
	}
	
	public static void checkAge(int n) throws RuntimeException {
		if(n<18) {
			throw new RuntimeException("leass than 18 not allowed");
		}else {
			System.out.println("possible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			new Example4().data(3);
			new Example4().checkAge(19);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(1);
		
		try {
			new Example4().data(3);
			new Example4().checkAge(14);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(2);
		
		
		try {
			new Example4().data(0);
			new Example4().checkAge(19);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("3....");
		
		try {
			new Example4().data(0);
			new Example4().checkAge(15);
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main method");

	}

}
