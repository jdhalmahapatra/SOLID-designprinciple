package com.solid.isp.bad;

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
	public void addExtraMilk() throws Exception{
		throw new Exception("In Espresso, we don't add milk");
	}

	@Override
	public void addExtraCoffee() {
		this.price += 10;
	}

}
