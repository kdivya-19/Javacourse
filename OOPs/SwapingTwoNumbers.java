package OOPs;

import java.util.Scanner;
public class SwapingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		
		System.out.println("Two numbers before swapping are: \n a= "+a+" \n b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Two numbers after swapping are: \n a= "+a+" \n b= "+b);
		
		
		s.close();
	}

}
