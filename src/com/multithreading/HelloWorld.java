package com.multithreading;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runnable runnable=new Runnable() {
			public void run() {
				System.out.println("Hello");
			}
		};
		
		Thread hello=new Thread(runnable);
		
		hello.start();
		hello.join();
		
		Thread world=new Thread(()->{
			System.out.println("World");
		});
		
		world.start();
		
	}

}
