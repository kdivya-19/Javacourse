package com.inheritance2;

public class Laptop extends Computer{
	
	public void showModel() {
		System.out.println("Model : XPS 15");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop comp=new Laptop();
		comp.showBrand();
		comp.showModel();
	}

}
