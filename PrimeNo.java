package ControlStatements;

public class PrimeNo {
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		 if(count==1) {
			 return true;
		 }
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers are: ");
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}
	}

}
