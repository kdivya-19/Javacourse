
import java.util.*;

abstract class Employee{
	private String empName;
	private String empID;
	private String department;
	
	public Employee(String empName,String empID,String department) {
		this.empName=empName;
		this.empID=empID;
		this.department=department;
	}
	
	public void setempName(String empName) {
		this.empName=empName;
	}
	
	public void setempID(String empID) {
		this.empID=empID;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public String getempName() {
		return empName;
	}
	
	public String getempID() {
		return empID;
	}
	
	public String getDepartment() {
		return department;
	}
	
	abstract void updateprojectName(String project);
	
	abstract void updateRole(String role);
	
	abstract void viewDetails();
	
	abstract void performanceScores();
}

class ProjectEmployee extends Employee{
	
	private String projectName;
	private String projectRole;
	private int[] scores=new int[3];
	
	
	public ProjectEmployee(String empName,String empID,String department,String projectName,String projectRole,int[] scores) {
		super(empName, empID, department);
		this.projectName=projectName;
		this.projectRole=projectRole;
		this.scores=scores;
		System.out.println("Profile created successfully");
		
	}
	
	public void setprojectName(String projectName) {
		this.projectName=projectName;
	}
	
	public void setprojectRole(String projectRole) {
		this.projectRole=projectRole;
	}
	
	public String getprojectName() {
		return projectName;
	}
	
	public String getprojectRole() {
		return projectRole;
	}
	
	public void updateprojectName(String projectName) {
		if(projectName.equals(" ")) {
			System.out.println("Invalid name entered");
		}else {
			setprojectName(projectName);
			System.out.println("Project name Updated");
		}
		
	}
	
	public void updateRole(String projectRole) {
		if(projectRole.equals(" ")) {
			System.out.println("Invalid role entered");
		}else {
			setprojectRole(projectRole);
			System.out.println("Project role Updated");
		}
		
	}
	
	public void viewDetails() {
		System.out.println("Employee name: "+getempName());
		System.out.println("Employee ID: "+getempID());
		System.out.println("Department: "+getDepartment());
		System.out.println("Project name: "+getprojectName());
		System.out.println("Project role: "+getprojectRole());
	}
	
	public void performanceScores() {
		System.out.println("Monthly performance scores: ");
		System.out.println("Month 1: "+scores[0]);
		System.out.println("Month 2: "+scores[1]);
		System.out.println("Month 3: "+scores[2]);
	}
	
	
}


public class EmployeeProjectSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter ID: ");
		String id=sc.nextLine();
		System.out.println("Enter department: ");
		String dept=sc.nextLine();
		System.out.println("Enter Project name: ");
		String project=sc.nextLine();
		System.out.println("Enter role: ");
		String role=sc.nextLine();
		int[] scores2=new int[3];
		for(int i=0;i<scores2.length;i++) {
			System.out.println("Enter "+(i+1)+" month score:");
			scores2[i]=sc.nextInt();
		}
		
		
		if(name.equals(" ") || id.equals(" ") || dept.equals(" ") || project.equals(" ") || role.equals("") || scores2.length<1 ) {
			System.out.println("Invalid inputs entered");
		}else {
			Employee emp1=new ProjectEmployee(name,id,dept,project,role,scores2);
			
			System.out.println("___-Menu____");
			System.out.println("1. Update Project name \n 2  Update Project Role \n 3. View Employee profile \n 4.View average performance scores \n 5. Exit.");
			
			boolean choice=true;
			while(choice) {
				System.out.println("Enter your option");
				int option=sc.nextInt();
				
				switch(option) {
				  case 1:
					  
					  System.out.println("Enter updated project name:");
					  String project2=sc.next();
					  emp1.updateprojectName(project2);
					  break;
					  
				  case 2:
					  System.out.println("Enter updated project role:");
					  role=sc.next();
					  emp1.updateRole(role);
					  break;
				  case 3:
					  emp1.performanceScores();
					  break;
				  case 4:
					  emp1.viewDetails();
					  break;
					  
				  case 5:
					  choice=false;
					  break;
					  
					
				}
			}
			
		}
		sc.close();
		

	}

}






















