package com.exceptionhandling;

class CarStop extends Exception{
	public CarStop(String msg) {
		super(msg);
	}
}

class CarPuncture extends Exception{
	public CarPuncture(String msg) {
		super(msg);
	}
}

class CarHeat extends Exception{
	public CarHeat(String msg) {
		super(msg);
	}
}

public class CarTest {
	
	public static void stop(String str) throws CarStop {
		if(str.equals("stop")){
				throw new CarStop("Car is stopped");
		}else {
			System.out.println("car not stopped");
		}
	}
	
	public static void puncture(String str) throws CarPuncture {
		if(str.equals("puncture")){
				throw new CarPuncture("Car is Punctured");
		}else {
			System.out.println("car not Punctured");
		}
	}
	
	public static void heat(double temp) throws CarHeat {
		if(temp>50){
				throw new CarHeat("Car is heated more than 50 C");
		}else {
			System.out.println("car not Heated");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new CarTest().stop("stops");
			
		}catch(CarStop e) {
			e.printStackTrace();
		}
		
		try {
			new CarTest().puncture("punctures");
		}catch(CarPuncture e) {
			e.printStackTrace();
		}
		try {
			new CarTest().heat(51);
		}
		catch(CarHeat e) {
			e.printStackTrace();
		}
		
		
	}

}
