package OOPs;

import java.util.Scanner;
class Staff {
	
	private String StaffName;
	private int StaffId;
	private String Shift;
	
	public Staff(String StaffName, int StaffId,String Shift) {
		this.StaffName=StaffName;
		this.StaffId=StaffId;
		this.Shift=Shift;
	}
}

class DepartmentStaff extends Staff{
	private String DepartName;
	private String ResLevel;
	
	public DepartmentStaff(String StaffName, int StaffId, String Shift, String DepartName,String ResLevel) {
		super(StaffName,StaffId,Shift);
		this.DepartName=DepartName;
		this.ResLevel=ResLevel;
		System.out.println("Staff Profile Created");
	}
	
	public void UpdateDepartment(String name) {
		if(name.equals("")) {
			System.out.println("You entered an Empty String");
		}else {
			
			DepartName=name;
			System.out.println("Updated Department tName");
		}
	}	
	
	public void UpdatedResponsibility(String level) {

		if(level.equals("")) {
			System.out.println("You entered an Invalid String");
		}else {
			ResLevel=level;
			System.out.println("Updated Responsibility Level");
		}
	}
	
	public void displayStaffDetails(String StaffName, int StaffId, String Shift, String DepartName,String Category) {
		System.out.println("Staff Details: ");
		System.out.println("Staff Name : "+StaffName);
		System.out.println("Staff ID : "+StaffId);
		System.out.println("Base Shift : "+Shift);
		System.out.println("Department  Name : "+DepartName);
		System.out.println("Responsibility Level  : "+ResLevel);
	}
	
}

public class StaffTrackingApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Staff Name:");
		String name=sc.next();
		System.out.println("Enter Staff ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Base Shift :");
		String shift=sc.next();
		System.out.println("Enter Department Name  :");
		String depart=sc.next();
		System.out.println("Enter Responsibility Level  :");
		String level=sc.next();
		
		System.out.println("-----MENU OPTIONS--------");
		System.out.println("1. Update Department Name \n 2. Update Responsibility Lavely \n 3. View Staff Details \n 4. Exit");
		
		DepartmentStaff obj=new DepartmentStaff(name,id,shift,depart,level);
		boolean choice = true;
		while(choice) {
			
			System.out.println("Enter Your Option from 1-4 :");
			int option=sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter new Department Name :");
					 depart=sc.next();
					obj.UpdateDepartment(depart);
					break;
				
				case 2:
					System.out.println("Enter new Responsibility Level :");
					level=sc.next();
					obj.UpdatedResponsibility(level);
					break;
				
				case 3:
					obj.displayStaffDetails(name, id, shift, depart, level);
					break;
				case 4:
					System.out.println("Thank You!");
					choice=false;
					break;
				default:
					System.out.println("Enter Valid Option");
			}
			
			
		}
		
		sc.close();
	}

}



