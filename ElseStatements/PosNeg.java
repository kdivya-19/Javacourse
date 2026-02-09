package ElseStatements;

public class PosNeg {
	String checkNumber(int num) {
		if (num>0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosNeg obj=new PosNeg();
		System.out.println("the number -8 is "+obj.checkNumber(-8));
	
	}

}
