package com.functionalInterfaces;
import java.util.function.Function;

class Numberchecker{
	public boolean checkNum(int n) {
		if (n<=1) {
			return false;
		}
		else {
			int c=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					c++;
				}
			}
			return c==1;
		}
	}
	
}
class CharChecking{
	
	
	public void checkChar(char c) {
		int val=c;
		
	}
}

public class FunctionInterface {

	public static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		else {
			int c=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					c++;
				}
			}
			return c==1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Numberchecker n1=new Numberchecker();
		
		Function<Integer, Boolean> f1=new Function<Integer, Boolean>(){
			public Boolean apply(Integer n) {
				return n1.checkNum(n);
			}
		};
		System.out.println(f1.apply(9));
		System.out.println(f1.apply(3));
		System.out.println(f1.apply(1));
		
		CharChecking ch1=new CharChecking();
		
		Function<Character, Boolean> f2=new Function<Character, Boolean>(){
			public Boolean apply(Character c) {
				int ascii=c;
				return isPrime((ascii));
			}
		};
		System.out.println(f2.apply('a'));
		System.out.println(f2.apply('b'));
		
	}

}




























