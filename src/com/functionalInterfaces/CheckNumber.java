package com.functionalInterfaces;
import java.util.function.Function;

public class CheckNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Boolean> f1=new Function<Integer, Boolean>(){
			public Boolean apply(Integer n) {
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
		};
		System.out.println(f1.apply(55));
		System.out.println(f1.apply(5));
		

	}

}
