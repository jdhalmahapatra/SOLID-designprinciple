package com.solid.isp.good;

public class Espresso implements Coffee{

	private double price;
	
	public Espresso(double price) {
		this.setPrice(price);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double totalPrice() {
		return this.price;
	}

	@Override
	public void addExtraCoffee() {
		this.price += 10;
	}

}
