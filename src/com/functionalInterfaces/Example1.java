package com.functionalInterfaces;
import java.util.function.Consumer;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1=new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		};
		
		Consumer<Integer> c2=new Consumer<Integer>() {
			public void accept(Integer n) {
				System.out.println(n);
			}
		};
		
		c2.accept(45);
	}

}
