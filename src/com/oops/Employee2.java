package com.oops;

 public class Employee2 {
	
	 int empId;
	String name;
	double[] salaries;
	public Employee2(int empId,String name,double[] salaries) {
		this.empId=empId;
		this.name=name;
		this.salaries=salaries;
		
	}
	
	public double calAnnualSalary() {
		double sum=0;
		for(double ele: salaries ) {
			sum+=ele;
		}
		return sum;
	}
	
	public void displayEmpDetails() {
		System.out.println("employee id: "+empId+" \n Nmae: "+name+"\n Annual Salary: "+calAnnualSalary());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 emp1=new Employee2(234,"Rohan",new double[]{30000.00,30000.00,30000.00,30000.00,30000.00,30000.00,30000.00,30000.00,75000.00,80000.00,85000.00,90000.00});
		Employee2 emp2=new Employee2(890,"Roshan",new double[]{30000.00,40000.00,45000.00,50000.00,30000.00,30000.00,30000.00,30000.00,30000.00,30000.00,30000.00,30000.00});
		
		Employee2 [] arr= {emp1,emp2};
		for(Employee2 element: arr) {
			element.displayEmpDetails();
		}

	}

}
