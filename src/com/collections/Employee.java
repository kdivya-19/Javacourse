package com.collections;

import java.util.*; 
import java.util.Scanner;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	public static void main(String[] args) {
		
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------MENU OPTIONS---------");
		
		System.out.println("1. Add Employee \n 2. Display all Employee Details  \n 3.Find Highest salary Employee   \n 4. Increase Salary by Percentage    \n 5. Exit");
		
		boolean run=true;
		ArrayList<Employee> arr=new ArrayList<Employee>();
		
		while(run) {
			System.out.println("Enter your option from 1-5 ");
			int option=sc.nextInt();
			
			
			switch(option) {
			
			case 1:
				System.out.println("Enetr id : ");
				int id1=sc.nextInt();
				
				System.out.println("Enter name:");
				String name1=sc.next();
				
				System.out.println("Enter salary: ");
				
				double sal=sc.nextDouble();
				
				
				
				Employee obj=new Employee(id1, name1, sal);
				if(arr.isEmpty() && sal>0) {
					arr.add(obj);
					System.out.println("Data Added Successfully...");
				}
				
				else {
					
					boolean added=true;
					for(Employee obj1:arr) {
						if(obj1.id==id1) {
							added=false;
						}
					}
					if(added==true && sal>0 ) {
						arr.add(obj);
						System.out.println("Data Added Successfully...");
					}else {
						System.out.println("Invalid credentials!-----");
					}
				}
				
				
				
				break;
				
				
			case 2:
				if(arr.isEmpty()) {
					System.out.println("List is empty");
				}
				else {
					for(Employee obj1:arr) {
						System.out.println(obj1);
					}
				}
				break;
				
				
			case 3:
				
				if(arr.isEmpty()) {
					System.out.println("List is empty");
				}
				
				else {
					double max_sal=0;;
					for(Employee obj1: arr) {
						if(obj1.salary>max_sal) {
							max_sal=obj1.salary;
						}
					}
					System.out.println(max_sal);
					
				}
				break;
			
			case 4:
				
				for(Employee obj1:arr) {
					obj1.salary=obj1.salary*0.1+obj1.salary;
					System.out.println(obj1.salary);
				}
				
				
				break;
				
			case 5:
				System.out.println("Thank you!");
				run=false;
				break;
				
			
				
			}
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}


















