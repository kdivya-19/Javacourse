package ElseStatements;

public class EvenOdd {
	String checkNumber(int num) {
		if (num%2==0) {
			return "Even number";
		}
		else {
			return "Odd number";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e1=new EvenOdd();
		System.out.println("33 is an "+e1.checkNumber(33));
	}

}
