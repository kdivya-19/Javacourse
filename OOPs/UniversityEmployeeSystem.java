package OOPs;

abstract class Employee2{
	
	private String empId;
	private String empName;
	
	public Employee2(String empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public String getempName() {
		return empName;
	}
	
	public String getempId() {
		return empId;
	}
	
	abstract double calSalary();
	
	abstract void displayDetails();
	
	 protected void printBasicInfo() {
		System.out.println("Employee Details: ");
		System.out.println("Employee Id: "+getempId());
		System.out.println("Employee name: "+getempName());
		
	}
	
}


class FacultyMember2 extends Employee2{
	private int departmentCode;
	private int yearsOfService;
	
	public FacultyMember2(String empId,String empName,int departmentCode,int yearsOfService) {
		super(empId,empName);
		this.departmentCode=departmentCode;
		this.yearsOfService=yearsOfService;
	}
	
	public int getDeptcode() {
		return departmentCode;
	}
	
	public int getyearsOfService() {
		return yearsOfService;
	}
	
	public double calSalary() {
		return 50000+1000*getyearsOfService();
	}
	
	public void displayDetails() {
		super.printBasicInfo();
		System.out.println("Employee Department code: "+getDeptcode());
		System.out.println("Employee years of Service: "+getyearsOfService());
		System.out.println("Monthly salary: "+calSalary());
	}
}

class StaffMember2 extends Employee2{
	private String designation;
	private double overtimeHrs;
	
	public StaffMember2(String empId,String empName,String designation,double overtimeHrs) {
		super(empId,empName);
		this.designation=designation;
		this.overtimeHrs=overtimeHrs;
	}
	
	public String getdesignation() {
		return designation;
	}
	
	public double getovertimeHrs() {
		return overtimeHrs;
	}
	
	public double calSalary() {
		return 40000+25*getovertimeHrs();
	}
	
	public void displayDetails() {
		super.printBasicInfo();
		System.out.println("Employee designation: "+getdesignation());
		System.out.println("Over time hours: "+getovertimeHrs());
		System.out.println("Monthly salary: "+calSalary());
	}
}

public class UniversityEmployeeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 emp1=new FacultyMember2("F001","John smith",101,5);
		emp1.displayDetails();
		
		Employee2 emp2=new StaffMember2("S001", "Jane Doe","Administrator",20.0);
		emp2.displayDetails();
	}

}
