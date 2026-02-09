package ElseStatements;

public class Divisible {
	boolean checkDivisible(int num) {
		if(num%5==0 && num%11==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible d1=new Divisible();
		System.out.println("Is 55 divisible by 5&11: "+d1.checkDivisible(55));
	}

}
