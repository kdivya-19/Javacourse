package com.exceptionhandling;

public class Example3 {
	public static void getData(int n) {
		try {
			if(n<0) {
				throw new Exception("Wanted");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example3().getData(0);
		System.out.println("Executed main method");
	}

}
