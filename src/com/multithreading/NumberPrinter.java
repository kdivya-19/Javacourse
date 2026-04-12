package com.multithreading;

public class NumberPrinter implements Runnable{
	private int start;
	private int end;
	
	public NumberPrinter(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	public void run() {
		if(start==2) {
			System.out.println(Thread.currentThread().getName());
			for(int i=start;i<=end;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println(Thread.currentThread().getName());
			for(int i=start;i<=end;i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Runnable runnable1=new NumberPrinter(2,20);
		Thread evenNumber=new Thread(runnable1);
		
		evenNumber.start();
		evenNumber.join();
		
		Runnable runnable2=new NumberPrinter(1,20);
		Thread oddNumber=new Thread(runnable2);
		
		oddNumber.start();
	}

}
