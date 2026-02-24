package com.oops;

class Course{
	
	String courseName;
	int[] marks;
	
	public Course(String courseName,int[] marks) {
		this.courseName=courseName;
		this.marks=marks;
	}
}

public class Student2 {
	
	int rollNo;
	String name;
	
	public Student2(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	Course course1=new Course("Maths",new int[] {75,65,86,98});
	Course course2=new Course("Science",new int[] {65,76,77,82});
	Course course3=new Course("English",new int[] {85,71,90,65});
	
	Course[] courses= {course1,course2,course3};
	
	public int courseAvg(Course obj) {
		int avg=0;
		for(int m1:obj.marks) {
			avg+=m1;
		}
		return avg/4;
	}
	
	
	public int overallAvg() {
		int totalavg=0;
		for(Course c1:courses) {
			totalavg+=courseAvg(c1);
		}
		return totalavg/2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1=new Student()
	}

}
