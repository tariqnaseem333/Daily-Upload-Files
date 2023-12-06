package wednesday_06_dec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderTester {
	
	public static void main(String[] args) {
		
		List<Order> orderList = new ArrayList<>();
		
		List<String> items1 = new ArrayList<>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Thortilla");
		orderList.add(new Order(101,items1,true));
		
		List<String> items2 = new ArrayList<>();
		items2.add("Pizza");
		items2.add("Pasta");
		orderList.add(new Order(102,items2,true));
		
		List<String> items3 = new ArrayList<>();
		items3.add("Burger");
		items3.add("Sandwich");
		items3.add("Pizza");
		orderList.add(new Order(103,items3,true));

//		2nd Way of Displaying Output
		System.out.println("Displaying order details: ");
		Iterator<Order> iterator = orderList.iterator();
		while( iterator.hasNext() ) {
			iterator.next().displayOrderDetails();
		}
		
////		Ist Way of Displaying Output
//		System.out.println("Displaying order details: ");
//		for( Order order : orderList ) {
//	    	System.out.println("Order Id: " + order.getOrderId());
//	    	System.out.println("Items: ");
//	    	for( String item : order.getItemNames() ) {
//	    		System.out.println(item);
//	    	}
//	    	System.out.println("-----------------------");
//		}
	
	}

}
