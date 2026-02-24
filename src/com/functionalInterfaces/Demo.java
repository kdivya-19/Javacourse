package com.functionalInterfaces;
import java.util.function.Consumer;

class Example2 implements Consumer<String> {
	@Override
	public void accept(String str) {
		System.out.println(str);
	}

}


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c1=new Example2();
		c1.accept("Hello");
		c1.accept("Java is awesome");

	}

}
