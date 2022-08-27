package com.solid.ocp.good;

public class Dessert extends MenuItem{

	
	
	public Dessert(String itemName, double price) {
		super(itemName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		// I am already Preapred but I need to be Freezed
		this.freeze();
	}
	
	public void freeze() {
		System.out.println("I am freezing");
	}

}
