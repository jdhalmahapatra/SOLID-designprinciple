package com.solid.ocp.bad;

public class OCPBadTest {

	public static void main(String[] args) {
//		MenuItem mainCourse = new MainCourse("Chicken Butter Masala", 100);
//		
//		FoodOrderRAW foodOrder = new FoodOrderRAW();
//		foodOrder.addOrderedItems(mainCourse);
//		
//		foodOrder.processOrders();
//		
//		System.out.println("The bill amount is: " + foodOrder.getBill());
//		
//		MenuItem desserts = new Dessert("Rasgola", 20);
//		foodOrder.addOrderedItems(desserts);
//		
//		try {
//			foodOrder.processOrders();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("The total bill amount is " + foodOrder.getBill());
		
		
		MenuItem mainCourse = new MainCourse("Chicken Butter Masala", 100);
		MenuItem desserts = new Dessert("Rasgola", 20);
		
		FoodOrderRAW foodOrder = new FoodOrderRAW();
		foodOrder.addOrderedItems(mainCourse);
		foodOrder.addOrderedItems(desserts);
		
		foodOrder.processOrders();
		
		
		System.out.println("The bill amount is: " + foodOrder.getBill());
		
	}

}
