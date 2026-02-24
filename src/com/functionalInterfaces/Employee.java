package com.functionalInterfaces;
import java.util.function.*;


public class Employee {
	
	private String name;
	private String designation;
	private double salary;
	
	public Employee(String name,String designation,double salary) {
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Employee> p=new Predicate<Employee>(){
			public boolean test(Employee emp) {
				return emp.getSalary()>10000;
			}
		};
		
		Consumer<Employee> c=new Consumer<Employee>() {
			
			public void accept(Employee emp) {
				System.out.println(emp.getName());
				System.out.println(emp.getDesignation());
				if(p.test(emp)) {
					System.out.println(emp.getSalary()+emp.getSalary()*0.1);
				}
			}
			
		};
		
		Employee emp=new Employee("Arjun","s/w",7000.00);
		Employee emp1=new Employee("X","Y",18000.00);
		Employee emp2=new Employee("M","N",25000.00);
		
		Employee[] arr= {emp,emp1,emp2};
		for(Employee obj:arr) {
			if(p.test(obj)) {
				obj.setSalary(obj.getSalary()+obj.getSalary()*0.1);
				c.accept(obj);
			}
		}
		

	}

}
