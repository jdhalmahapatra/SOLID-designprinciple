package com.solid.ocp.good;

public class OCPGoodTest {

	public static void main(String[] args) {
		MenuItem mainCourse = new MainCourse("Chicken Butter Masala", 100);
		MenuItem desserts = new Dessert("Rasgola", 20);
		
		FoodOrderRAW foodOrder = new FoodOrderRAW();
		foodOrder.addOrderedItems(mainCourse);
		foodOrder.addOrderedItems(desserts);
		
		foodOrder.processOrders();
		
		
		System.out.println("The bill amount is: " + foodOrder.getBill());
	}

}
