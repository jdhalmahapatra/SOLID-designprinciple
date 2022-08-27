package com.solid.ocp.bad;

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
			if(item instanceof MainCourse) {
				item.prepare();
			}
			else {
				System.out.println("Manually Handling the food order preparation");
				((Dessert) item).freeze();
			}
				
		}
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
