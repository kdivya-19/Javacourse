package com.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;

 public class EmployeeExp2 {
	
	 private String name;
		private String designation;
		private double salary;
		
		public EmployeeExp2(String name,String designation,double salary) {
			this.name=name;
			this.designation=designation;
			this.salary=salary;
			
		}
		
		public String toString() {
			return "Employee [name: "+name+" Designation: "+designation+" Salary: "+salary+"]";      
		}
		
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmployeeExp2 emp=new EmployeeExp2("rahul","s/w",25000);
//		Employee emp=new Employee("rahul","s/w",25000);
		
		Consumer<EmployeeExp2> consumer=new Consumer<EmployeeExp2>() {
			public void accept(EmployeeExp2 emp1) {
				System.out.println(emp1);
			}
		};
		
		consumer.accept(emp);
	}

}
