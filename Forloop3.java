package ControlStatements;

public class Forloop3 {

	public static void printNos() {
	 System.out.println("Numbers from 1-10:" );
	  for(int i=1;i<=10;i++) {
         System.out.println(i);
	  }
	}
  public static void ReverseNos() {
	 System.out.println("Reverse Order of numbers from 1-10:" );
	  for(int i=10;i>0;i--) {
         System.out.println(i);
	  }
	}
	public static void IncreasingBy5() {
	 System.out.println("Increasing numbers by 5 from 0-50:" );
	  for(int i=0;i<=50;i+=5) {
         System.out.println(i);
	  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNos();
		ReverseNos();
		IncreasingBy5();
	}

}
