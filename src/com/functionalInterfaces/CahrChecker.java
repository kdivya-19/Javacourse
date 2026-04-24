package com.functionalInterfaces;
import java.util.function.Function;

public class CahrChecker  {
	private char c;
	public CahrChecker(Character c) {
		this.c=c;
	}
	
	public int checkChar() {
		int ascii=getC();
		return ascii;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CahrChecker obj=new CahrChecker('a');
		
		Function<CahrChecker, Void> f2=new Function<CahrChecker, Void>(){
			public Void apply(CahrChecker ch) {
				int n=ch.checkChar();
				if(n<=1) {
					System.out.println("Not prime");
					return null;
					
				}
				else {
					int c=0;
					for(int i=1;i<=n/2;i++) {
						if(n%i==0) {
							c++;
						}
					}
					if(c==1) {
						System.out.println("Prime");
						return null;
					}else {
						System.out.println("Not prime");
						return null;
					}
				}
			}
		};
		
		f2.apply(obj);
	}

}
