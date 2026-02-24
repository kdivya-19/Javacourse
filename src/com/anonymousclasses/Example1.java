package com.anonymousclasses;

 class Animal{
	public void makeSound() {
		System.out.println("makes sound");
	}
}

public class Example1 {
	public static void main(String[] args) {
		Animal class1=new Animal() {
			public void makeSound() {
				System.out.println("Woob woob");
			}
		};
		class1.makeSound();
	}
	
}
