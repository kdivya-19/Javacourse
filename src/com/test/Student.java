package com.test;
import java.util.Arrays;
import java.util.function.*;
import java.util.Scanner;

interface LambdaInterface {
	void displayres();
}

interface EligibilityChecker {
	String checkEligibility(Student sobj);
}

class IllegalArgumentException extends Exception{
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}

public class Student {
	
	private int studentId;
	private String studentname;
	private int[] marks=new int[3];
	
	public Student(int studentId,String studentname,int[] marks) {
		this.studentId=studentId;
		this.studentname=studentname;
		this.marks=marks;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	public int calculateTotal() {
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total+=marks[i];
		}
		return total;
	}
	
	public double calculateAverage() {
		return calculateTotal()/3;
	}
	
	public void displayStdDetails() {
		System.out.println("Student ID: "+getStudentId());
		System.out.println("Student name: "+getStudentname());
		System.out.println("Student Marks: "+Arrays.toString(getMarks()));
		System.out.println("Total Marks: "+calculateTotal());
		System.out.println("Average marks: "+calculateAverage());
		
	}
	
	public static void main(String[] args) {
		Student students[]=new Student[3];
		
		EligibilityChecker eligible =new EligibilityChecker(){
			public String checkEligibility(Student std) {
				return std.calculateAverage()>=40?"YES":"NO";
			}
		};
		
		Predicate<Double> pass=new Predicate<Double>() {
			
			public boolean test(Double avg) {
				return avg>=35;
			}
			
		};
		
		Function<Double , String > grade=new Function<Double , String >(){
			public String apply(Double avg) {
				if(avg>=75) {
					return "Grade A";
				}else if(avg>=60) {
					return "Grade B";
				}else if(avg>=50) {
					return "Grade C";
				}else {
					return "Grade D";
				}
			}
		};
		
		
		Consumer<Student> details=new Consumer<Student>() {
			public void accept(Student std) {
				std.displayStdDetails();
				System.out.println("Eligibility:"+eligible.checkEligibility(std));
				if(pass.test(std.calculateAverage())){
					System.out.println("Result: PASS ");
				}else {
					System.out.println("Result: FAIL ");
				}
				
				System.out.println(grade.apply(std.calculateAverage()));
				
			}
		};
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter name: ");
			String name =sc.next();
			System.out.println("Enter Id: ");
			int id =sc.nextInt();
			int[] markss=new int[3];
			
			try {
				for(int j=0;j<3;j++) {
					System.out.println("marks "+j);
					markss[j] =sc.nextInt();
					if(markss[j]<1 || markss[j]>100) {
						throw new IllegalArgumentException("Marks should be between 1-100");
					}
				
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		 Student std=new Student(id,name,markss);
		  students[i]=std;
		 
		}
		
		for(Student stdobj:students) {
			LambdaInterface obj=()->{
				details.accept(stdobj);
			};
			
			obj.displayres();
		}

	}

}










