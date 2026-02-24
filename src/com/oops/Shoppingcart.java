package com.oops;

 class CartItem {
	int itemId;
	String itemName;
	double[] prices;
	
	public CartItem(int itemId,String itemName,double[] prices) {
		this.itemId=itemId;
		this.itemName=itemName;
		this.prices=prices;
		
	}
}


public class Shoppingcart {
	
	CartItem item1=new CartItem(11,"soap",new double[] {45.00,35.00,60.90});
	CartItem item2=new CartItem(121,"brush",new double[] {20.00,35.00,18.60});
	CartItem item3=new CartItem(133,"paste",new double[] {25.00,55.00,48.00});
	CartItem item4=new CartItem(134,"Shampoo",new double[] {86.00,100.00,90.00});
	
	CartItem[] items= {item1,item2,item3,item4};
	
	public double lowestCost(CartItem obj) {
			double lower=obj.prices[0];
			for(double element:obj.prices) {
				if(element<lower) {
					lower=element;
				}
			}
			
		return lower;
	}
	
	
	
	public void displayCart() {
		
		for(CartItem element: items) {
			System.out.println("Item id: "+element.itemId);
			System.out.println("Item name: "+element.itemName);
			System.out.println("Lowest price: "+lowestCost(element)+"\n");
			
		}
		
	}
	
	public double totalCost() {
		
		double total=0;
		for(CartItem element: items) {
			total+=lowestCost(element);
		}
		return total;
	}
	
	public static void main(String[] args) {
		Shoppingcart s1=new Shoppingcart();
		s1.displayCart();
		System.out.println("Total cost of all items in cart: "+s1.totalCost());
	}
	
}
















