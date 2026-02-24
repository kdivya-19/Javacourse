package com.oops;

import java.util.Arrays;

public class Student {
	
	private int stdId;
	private String name;
	private int[] marks;
	
	
	public Student(int stdId,String name,int[] marks) {
		this.stdId=stdId;
		this.name=name;
		this.marks=marks;
	}
	
	public void calAverage() {
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			avg+=marks[i];
		}
		System.out.println("Averagee = "+avg/3);
		
	}
	
	public void displayDetails() {
		System.out.println("Roll number: "+stdId);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+Arrays.toString(marks));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {80,95,78,88,90};
		Student std1=new Student(56,"divya",arr);
		std1.displayDetails();
		std1.calAverage();
		System.out.println();
		
		 int[] arr2= {80,75,78,88,86};
		Student std2=new Student(57,"Shivani",arr2);
		
		
		int[] arr3= {70,75,68,88,66};
		Student std3=new Student(58,"Shivani",arr3);
		

	}

}
