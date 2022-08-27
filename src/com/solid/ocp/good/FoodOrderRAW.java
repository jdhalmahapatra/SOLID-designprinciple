package com.solid.ocp.good;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderRAW {
	private final List<MenuItem> orderedItems;
	
	public FoodOrderRAW() {
		this.orderedItems = new ArrayList<>();
	}
	
	public void processOrders() {
		System.out.println("Food Order Processing");
		
		for(MenuItem item : this.orderedItems) {
			item.prepare();
		}
		System.out.println("Food Order Processed");
	}
	
	public Double getBill() {
		Double totalPrice = 0.0;
		for(MenuItem item: this.orderedItems) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	public void addOrderedItems(MenuItem item) {
		this.orderedItems.add(item);
	}
}
