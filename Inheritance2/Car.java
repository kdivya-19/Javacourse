package com.inheritance2;

public class Car extends Vehicle {
	public void speed() {
		System.out.println("Car is moving at 80 km/hr");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car vehicle1=new Car();
		vehicle1.run();
		vehicle1.speed();
	}

}
