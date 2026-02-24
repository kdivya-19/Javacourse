package com.college.model;

public class Student extends Person{
	
	private int studentId;
	private String departmant;
	private String courseName;
	
	public Student() {}
	
	public Student(int studentId,String departmant,String courseName){
		this.studentId=studentId;
		this.departmant=departmant;
		this.courseName=courseName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void displayDetails() {
		System.out.println("Person Name is: "+getName());
		System.out.println("Person age is: "+getAge());
		System.out.println("Person Contact No. : "+getContactNumber());
		System.out.println("Student id: "+getStudentId());
		System.out.println("Student Department: "+getDepartmant());
		System.out.println(" CourseName: "+getCourseName());
	}
	
}
