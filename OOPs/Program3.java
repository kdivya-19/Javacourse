package OOPs;

import java.util.Scanner;
class SalesEmployee {
	
	private String EmployeeName;
	private int EmployeeId;
	
	public SalesEmployee(String EmployeeName, int EmployeeId) {
		this.EmployeeName=EmployeeName;
		this.EmployeeId=EmployeeId;
	}
}

class PerformanceEmployee extends SalesEmployee{
	private double totalsales;
	private double  avgsales;
	private String Grade;
	public int count=1;
	
	public PerformanceEmployee(String EmployeeName,int EmployeeId,double totalsales) {
		super(EmployeeName,EmployeeId);
		this.totalsales=totalsales;
//		this.avgsales=avgsales;
//		this.Grade=Grade;
		System.out.println("Performance Profile Created");
	}
	
	public void AddSales(double sales ) {
		if(sales>0) {
			count++;
			totalsales+=sales;
			System.out.println("Added sales amount to total sales: ");
		}else {
			System.out.println("Invalid Amount Entered");
		}
	}	
	
	public double Calculateresult() {
		double res=totalsales/count;
		avgsales=res;
		return avgsales;
	}
	
	public String showGrade() {
		if(avgsales>=10000) {
			return "good";
		}
		return "bad";
	}
	
	public void displayDetails(String EmployeeName,int EmployeeId,double totalsales,double avgsales,String Grade) {
		System.out.println("Performance Profile Created: ");
		System.out.println("Employee Name : "+EmployeeName);
		System.out.println("Employee ID : "+EmployeeId);
		System.out.println("Total Sales : "+totalsales);
		System.out.println("Average Sales: "+avgsales);
		System.out.println("Performance Grade : "+Grade);
	}
}

public class Program3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter Total sales :");
		double total=sc.nextDouble();
		
		System.out.println("-----MENU OPTIONS--------");
		System.out.println("1. Add Sales \n 2. Calculate result \n 3. View Performance Details \n 4. Exit");
		
		PerformanceEmployee obj=new PerformanceEmployee(name,id, total);
		boolean choice = true;
		while(choice) {
			
			System.out.println("Enter Your Option from 1-4 :");
			int option=sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Add Sales Enter amount :");
					total=sc.nextDouble();
					obj.AddSales(total);
					break;
			
				case 2:
					System.out.println(" Average sales :"+obj.Calculateresult());
					break;
				
				case 3:
					double avg=obj.Calculateresult();
					String grade=obj.showGrade();
					obj.displayDetails(name, id, total,  avg, grade);
					break;
				case 4:
					System.out.println("Thank You!");
					choice=false;
					break;
				default:
					System.out.println("Enter Valid Option");
			}
		}
	}

}
