package com.solid.ocp.good;

public class MainCourse extends MenuItem{
	public MainCourse(String itemName, double price) {
		super(itemName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		System.out.println("Prepared Main Course");
		
	}

}
