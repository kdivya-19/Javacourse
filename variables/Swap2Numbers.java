package com.variables;

public class Swap2Numbers {
	
	public static void swapTwoNos(int num1,int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping: \n num1= "+num1+"\n num2= "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=78;
		int num2=45;
		System.out.println("Before swapping: \n num1= "+num1+"\n num2= "+num2);
		
		swapTwoNos(num1,num2);
		


	}

}
