package com.multithreading;

public class ThreadCreation extends Thread{
	public void run() {
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello there"+Thread.currentThread().getName());
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method start");
		Thread th1=new ThreadCreation();
		Thread th2=new ThreadCreation();
		
		th1.start();
		
		th2.start();
		
		
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Main method End");
	}

}
