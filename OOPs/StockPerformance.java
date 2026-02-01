package OOPs;

import java.util.Scanner;
 class StockHandler{
	
	private String HandlerName;
	private int HandlerId;
	
	public StockHandler(String HandlerName,int HandlerId) {
		this.HandlerName=HandlerName;
		this.HandlerId=HandlerId;
	}
}

public class StockPerformance extends  StockHandler{
	
	private double totalStack;
	private double AvgStock;
	private String Grade;
	
	public StockPerformance(String HandlerName,int HandlerId,double totalStack) {
		super(HandlerName,HandlerId);
		this.totalStack=totalStack;
//		this.AvgStock=AvgStock;
//		this.Grade=Grade;
		
	}
	
	public void AddStock(double stock) {
		if(stock>0) {
			totalStack+=stock;
			System.out.println("Added Stock");
		}else{
			System.out.println("You entered Invalid Stock Amount ");
		}
	}
	
	public int count=1;
	public void CalculatePerformance() {
		
		if(totalStack>0) {
			count++;
			AvgStock=totalStack/count;
			System.out.println("Updated Performance Result");
		}else {
			System.out.println("Your TotalStock amount is Invalid");
		}
	}
	
	public void ShowGrade() {
		
	}
	
	public void DisplayDetails(String HandlerName,int HandlerId,double totalStack) {
		System.out.println("Handler Name "+HandlerName);
		System.out.println("Handler ID "+HandlerId);
		System.out.println("Total Stock  "+totalStack);
		System.out.println("Average Stock  "+AvgStock);
		System.out.println(" Performance Grade ");
	}
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
