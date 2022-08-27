package com.solid.ocp.good;

public abstract class MenuItem {
	private String itemName;
	private final double price;

	public MenuItem(String itemName, double price) {
		this.setItemName(itemName);
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}
	
	public abstract void prepare();

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
