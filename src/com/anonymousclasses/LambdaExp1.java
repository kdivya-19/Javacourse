package com.anonymousclasses;

interface LambdaInterface {
	void sayHello();
}

public class LambdaExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface obj= ()-> System.out.println("Hello Everyone");
		obj.sayHello();

	}

}
