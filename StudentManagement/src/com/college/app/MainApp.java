package com.college.app;
import java.util.Scanner;

import com.college.model.*;
import com.college.service.StudentService;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name: ");
		String name=sc.next();
		System.out.println("Enter Student Age: ");
		int age=sc.nextInt();
		System.out.println("Enter Contact Number: ");
		int contact=sc.nextInt();
		System.out.println("Enter Student ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Department: ");
		String department=sc.next();
		System.out.println("Enter CourseName: ");
		String course=sc.next();
		System.out.println("Enter Course Fee: ");
		double fee=sc.nextDouble();
		
		
		System.out.println("---Student Details---");
		Student st=new Student(id,department, course);
		st.setName(name);
		st.setAge(age);
		st.setContactNumber(contact);
		st.displayDetails();
		
		Course c1=new Course(01,"Java",fee);
		System.out.println("Original Fee: "+c1.getCourseFee());
		
		StudentService service =new StudentService();
		double discountApplied=service.calsulateDuscountedFee(fee, department);
		
		System.out.println("Discount Applied= "+discountApplied);
		
		System.out.println("\nFinal Payable fee= "+(fee-discountApplied));
		
		
	}

}
