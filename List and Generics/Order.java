package wednesday_06_dec;

import java.util.Iterator;
import java.util.List;

public class Order {
	
//	Instance Variables
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivery;
    
//  Constructor
    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
    	this.orderId = orderId;
    	this.itemNames = itemNames;
    	this.cashOnDelivery = cashOnDelivery;
    }
    
//  Method
    public void displayOrderDetails() {
    	System.out.println("Order Id: " + this.getOrderId());
    	System.out.println("Items: ");
    	Iterator<String> items = this.getItemNames().iterator();
    	while( items.hasNext() ) {
    		System.out.println(items.next());
    	}
    	System.out.println("-----------------------");
    }
    
//  Getters and Setters
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<String> getItemNames() {
		return itemNames;
	}
	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}
	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
    
}
