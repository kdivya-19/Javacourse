package OOPs;

abstract class Employee{
	private String empId;
	private String  name;
	
	public Employee(String empId,String name) {
		this.empId=empId;
		this.name=name;
	}
	
	public String getempId() {
		return empId;
	}
	
	public String getname() {
		return name;
	}
	
	abstract double calculateSalary();
	abstract void displayDetails();
	
	protected void printBasicInfo() {
		System.out.println("Employee Id: "+getempId());
		System.out.println("Employee name: "+getname());
	}
}

class FacultyMember extends Employee{
	private int deptCode;
	private int yearsOfService;
	
	public FacultyMember(String empId,String name, int deptCode,int yearsOfService) {
		super(empId,name);
		this.deptCode=deptCode;
		this.yearsOfService=yearsOfService;
	}
	
	public int getdeptCode() {
		return deptCode;
	}
	
	public int getyearsOfService() {
		return yearsOfService;
	}
	
	@Override double calculateSalary() {
		return 50000.00+yearsOfService*1000.00;
	}
	
	void displayDetails() {
		System.out.println("Employee Details");
		printBasicInfo();
		System.out.println("Department Code: "+getdeptCode());
		System.out.println("Years of service: "+getyearsOfService());
		System.out.println("Monthly salary: $"+calculateSalary());
		
	}
	
}

class StaffMember extends Employee{
	private String designation;
	private double overtime;
	
	public StaffMember(String empId,String name,String designation,double overtime) {
		super(empId,name);
		this.designation=designation;
		this.overtime=overtime;
	}
	
	public String getdesignation() {
		return designation;
	}
	
	public double getovertime() {
		return overtime;
	}
	
	@Override double calculateSalary() {
		return 40000+25*overtime;
	}
	
	void displayDetails() {
		System.out.println("Employee Details");
		printBasicInfo();
		System.out.println("Designation : "+getdesignation());
		System.out.println("Overtime hours: "+getovertime());
		System.out.println("Monthly salary: $"+calculateSalary());
	}
	
}

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacultyMember obj1=new FacultyMember("F001","John smith",101,5);
		obj1.displayDetails();
		System.out.println("-----------------------------------");
		StaffMember obj2=new StaffMember("S001","Jane Doe","Administrator",20.0);
		obj2.displayDetails();

	}

}
