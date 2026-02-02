package Ladderif;

public class Example1 {
	
	public static void getBonus(int exp,int rating,int sal) {
		if(exp>5 && rating>9) {
			System.out.println(sal/2);
		}
		else if(exp>3 && rating>5) {
			System.out.println((sal*3)/10);
		}
		else if(exp>1 && rating>3) {
			System.out.println(sal/10);
		}
		else {
			System.out.println("no bonus");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBonus(4,7,50000);
	}

}
