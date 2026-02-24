package OOPs;

import java.util.Scanner;
class InsurancePlolicy {
	
	private String CustomerName;
	private String PolicyType;
	private int Amount;
	private int ApprovedAmount;
	private String PolicyStatus;
	
	public InsurancePlolicy(String CustomerName, String PolicyType,int Amount,int ApprovedAmount,String PolicyStatus) {
		this.CustomerName=CustomerName;
		this.PolicyType=PolicyType;
		this.Amount=Amount;
		this.ApprovedAmount=ApprovedAmount;
		this.PolicyStatus=PolicyStatus;
		System.out.println("Policy Record Created");
	}
	
	public void UpdateApproval(int amt) {
		if(amt>0) {
			ApprovedAmount=amt;
			System.out.println(" Updated Approved Amount is: "+ApprovedAmount);
		}
		else {
			System.out.println(" Enter valid amount");
		}
	}
	
	public void UpdateStatus(String status) {
		if(status.equals("")) {
			System.out.println(" Enter valid status");
		}
		else {
			PolicyStatus=status;
			System.out.println(" Updated Your Policy Status as: "+status);
		}
	}
	
	public void display(String CustomerName, String PolicyType,int Amount, int ApprovedAmount,String PolicyStatus) {
		System.out.println("Policy Details: ");
		System.out.println("Customer Name : "+CustomerName);
		System.out.println("Policy Type : "+PolicyType);
		System.out.println("Amount : "+Amount);
		System.out.println("Approved Amount: "+ApprovedAmount);
		System.out.println("Policy Status: "+PolicyStatus);
	}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name=sc.next();
		System.out.println("Enter Policy Type:");
		String type=sc.next();
		System.out.println("Enter Amount:");
		int amt=sc.nextInt();
		System.out.println("Enter Approved Amount:");
		int approved=sc.nextInt();
		System.out.println("Enter Policy Status  :");
		String status=sc.next();
		
		System.out.println("-----MENU OPTIONS--------");
		System.out.println("1. Update Approved Amount \n 2. Change Policy Status  \n 3. View Policy Details \n 4. Exit");
		
		InsurancePlolicy obj=new InsurancePlolicy(name,type,amt,approved,status);
		boolean choice = true;
		while(choice) {
			
			System.out.println("Enter Your Option from 1-4 :");
			int option=sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter Approved aount :");
					 approved=sc.nextInt();
					obj.UpdateApproval(approved);
					break;
				
				case 2:
					System.out.println("Enter Policy Status:");
					status=sc.next();
					obj.UpdateStatus(status);
					break;
				
				case 3:
					obj.display(name, type, amt, approved, status);
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
