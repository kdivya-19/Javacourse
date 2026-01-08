package OOPs;
import java.util.Scanner;
public class PrimeNumber {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>1) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(checkPrime(n)) {
			System.out.println(n+" is a Prime number");
		}else {
			System.out.println(n+" is NOT a Prime number");
		}
		
		sc.close();
	}

}
