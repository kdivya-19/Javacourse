package com.exceptionhandling;

public class Example2 {
	public void isEven(int num) throws Exception {
		if(num<=0) {
//			throw new Exception("Number should not be a zero or negative");
			throw new RuntimeException();
		}else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Example2().isEven(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Executed ");
		

	}

}
