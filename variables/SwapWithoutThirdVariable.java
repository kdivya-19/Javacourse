package com.variables;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6;
		int b=12;
		System.out.println("Before swapping: \n a= "+a+"\n b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: \n a= "+a+"\n b= "+b);

		//2nd method
		int c=5;
		int d=13;
		System.out.println("Before swapping: \n c= "+c+"\n d= "+d);
		c=c^d;
		d=c^d;
		c=c^d;
		System.out.println("After swapping: \n c= "+c+"\n d= "+d);

	}

}
