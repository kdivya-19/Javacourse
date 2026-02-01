package OOPs;

import java.util.Scanner;
public class SubscriptionRegistration {

	private String SubscriberName;
	private String PlanType;
	private double PlanCost ;
	private double PaidAmt ;
	private String SubscriptionStatus;
	
	public SubscriptionRegistration(String SubscriberName,String PlanType, double PlanCost,double PaidAmt,String SubscriptionStatus) {
		this.SubscriberName=SubscriberName;
		this.PlanType=PlanType;
		this.PlanCost=PlanCost;
		this.PaidAmt=PaidAmt;
		this.SubscriptionStatus=SubscriptionStatus;
	}
	
	public void UpdatePaidAmount(double amt) {
		if(amt>0) {
			PaidAmt+=amt;
			System.out.println("Updated Paid Amount");
		}else {
			System.out.println("Enter Valid Amount");
		}
	}
	
	public void UpdateStatus(String status) {
		if(status.equals("")){
			System.out.println("Enter Valid Status");
		}else {
			SubscriptionStatus=status;
			System.out.println("Updated Subscriptio nStatus");
			
			
			
		}
	}
	
	public void displayPlanDetails() {
		System.out.println("Subscriber Name: "+SubscriberName);
		System.out.println(" Plan Type : "+PlanType);
		System.out.println("  Plan Cost :"+PlanCost);
		System.out.println(" Paid Amount : "+PaidAmt);
		System.out.println("Subscriber Status: "+SubscriptionStatus);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter \"Subscriber Name: ");
		String name=sc.next();
		System.out.println("Enter  Plan Type : ");
		String type=sc.next();
		System.out.println("Enter  Plan Cost :");
		double cost=sc.nextDouble();
		System.out.println("Enter  Paid Amount :");
		double paid=sc.nextDouble();
		System.out.println("Enter Subscriber Status: ");
		String status=sc.next();
		SubscriptionRegistration obj=new SubscriptionRegistration(name,type,cost,paid,status);
		
		System.out.println("-----MENU OPTIONS--------");
		System.out.println("1. Update paid Amount  \n 2. Change Status \n 3. View Subscription Details \n 4. Exit");
		
		
		boolean choice=true;
		
		while(choice) {
			System.out.println("Enter Your Option from 1-4 :");
			int option=sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter Paid Amount :");
					 paid=sc.nextDouble();
					obj.UpdatePaidAmount(paid);
					break;
				
				case 2:
					System.out.println("Enter new Subscription Status :");
					status=sc.next();
					obj.UpdateStatus(status);
					break;
				
				case 3:
					obj.displayPlanDetails();
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
