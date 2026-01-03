package com.college.model;

public class Person {
	private String name;
	private int age;
	private int contactNumber;
	
	public Person() {}
	
	public Person(String name,int age,int contactNumber) {
		this.name=name;
		this.age=age;
		this.contactNumber=contactNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public int getContactNumber() {
		return contactNumber;
	}
	
}
