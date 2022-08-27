package com.solid.ocp.bad;

public class Dessert extends MenuItem{

	
	
	public Dessert(String itemName, double price) {
		super(itemName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		// I am already Preapred but I need to be Freezed
	}
	
	public void freeze() {
		System.out.println("I am freezing");
	}

}
