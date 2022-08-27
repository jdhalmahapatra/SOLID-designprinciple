package com.solid.isp.bad;

public class Latte implements Coffee {

	private double price;
	
	public Latte(double price) {
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
	public void addExtraMilk() throws Exception {
		this.price += 5;
	}

	@Override
	public void addExtraCoffee() {
		this.price += 10;
	}

	

}
