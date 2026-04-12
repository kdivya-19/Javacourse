package com.multithreading;

public class Example1 {
	static int c=0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Main method start");
		Thread th1=new Thread(()->{
			for(int i=0;i<10000;i++) {
				c++;
			}
		});
		
		Thread th2=new Thread(()->{
			for(int i=0;i<10000;i++) {
				c++;
			}
		});
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		System.out.println(c);
		System.out.println("Main method End");
		
	}

}
