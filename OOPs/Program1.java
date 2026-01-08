package OOPs;

import java.util.Scanner;
class Vehicle {
	
	private String OwnerName;
	private String VahicleType;
	private String VehicleNo;
	
	public Vehicle(String OwnerName, String VahicleType,String VehicleNo) {
		this.OwnerName=OwnerName;
		this.VahicleType=VahicleType;
		this.VehicleNo=VehicleNo;
		
	}
}

class ServiceVehicle extends Vehicle{
	private String CenterName;
	private String Category;
	
	public ServiceVehicle(String OwnerName, String VahicleType, String VehicleNo, String CenterName,String Category) {
		super(OwnerName,VahicleType,VehicleNo);
		this.CenterName=CenterName;
		this.Category=Category;
		System.out.println("Vehicle Profile Created");
	}
	
	public void UpdateCenterName(String centername) {
		if(centername.equals("")) {
			System.out.println("You entered an Empty String");
		}else {
			
			CenterName=centername;
			System.out.println("Updated Center Name as: "+CenterName);
		}
	}	
	
	public void UpdatedCategory(String category) {
		if(category.equals("")) {
			System.out.println("You entered an Empty String");
		}else {
			Category=category;
			System.out.println("Updated Center Name as: "+Category);
		}
	}
	
	public void display(String OwnerName, String VahicleType, String VehicleNo, String CenterName,String Category) {
		System.out.println("Vehicle Details: ");
		System.out.println("Owner Name : "+OwnerName);
		System.out.println("Vehicle Type : "+VahicleType);
		System.out.println("Vehicle Number : "+VehicleNo);
		System.out.println("Service Centter Name : "+CenterName);
		System.out.println("Service Category : "+Category);
	}
	
}

public class Program1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Owner Name:");
		String name=sc.next();
		System.out.println("Enter Vehicle Type:");
		String type=sc.next();
		System.out.println("Enter Vehicle Number:");
		String number=sc.next();
		System.out.println("Enter Service CenterName :");
		String centername=sc.next();
		System.out.println("Enter Service Category :");
		String category=sc.next();
		
		System.out.println("-----MENU OPTIONS--------");
		System.out.println("1. UpdateCenterName \n 2. UpdateService Category \n 3. View Profile Details \n 4. Exit");
		
		ServiceVehicle obj=new ServiceVehicle(name,type,number,centername,category);
		boolean choice = true;
		while(choice) {
			
			System.out.println("Enter Your Option from 1-4 :");
			int option=sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter Service CenterName :");
					 centername=sc.next();
					obj.UpdateCenterName(centername);
					break;
				
				case 2:
					System.out.println("Enter Service Category :");
					category=sc.next();
					obj.UpdatedCategory(category);
					break;
				
				case 3:
					obj.display(name, type, number, centername, category);
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
