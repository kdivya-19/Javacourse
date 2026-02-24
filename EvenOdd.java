package ControlStatements;

public class EvenOdd {
	public static void Even() {
		 System.out.println("Even Numbers from 1-20" );
		  for(int i=2;i<=20;i+=2) {
	         System.out.println(i);
		  }
		}
	public static void Odd() {
		 System.out.println("Odd Numbers from 1-20" );
		  for(int i=1;i<=20;i+=2) {
	         System.out.println(i);
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even();
		Odd();
	}

}
