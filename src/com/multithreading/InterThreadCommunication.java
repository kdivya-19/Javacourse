package com.multithreading;

class Producer implements Runnable{
	StringBuffer sb;
	public Producer() {
		this.sb=new StringBuffer();
	}
	
	public void run(){
		try {
			synchronized(sb) {
				for(int i=1;i<10;i++) {
					sb.append(i);
					System.out.println(sb);
					Thread.sleep(2000);
				}
				sb.notify();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

class Consumer implements Runnable {
	Producer p;
	Consumer(Producer p){
		this.p=p;
	}
	
	public void run() {
		
		try {
			
			synchronized(p.sb) {
				System.out.println("Waiting for the Producer thread ...");
				p.sb.wait();
				System.out.println("Using data from producer ...");
				System.out.println(p.sb.toString());
				Thread.sleep(2000);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producer p=new Producer();
		Consumer c=new Consumer(p);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		t2.start();
		t1.start();
		
		
	}

}
