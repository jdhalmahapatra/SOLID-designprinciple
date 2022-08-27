package com.solid.ocp.bad;

public abstract class MenuItem {
	private final String itemName;
	private final double price;

	public MenuItem(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
	
	public abstract void prepare();
}
