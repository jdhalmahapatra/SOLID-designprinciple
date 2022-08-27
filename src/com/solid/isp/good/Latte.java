package com.solid.isp.good;

public class Latte implements Coffee, MilkBased {

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
	public void addExtraCoffee() {
		this.price += 10;
	}

	@Override
	public void addExtraMilk() {
		this.price +=5;
	}

	

}
