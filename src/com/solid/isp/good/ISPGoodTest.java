package com.solid.isp.good;

public class ISPGoodTest {

	public static void main(String[] args){
		System.out.println("Espresso Details: ");
		Coffee espresso = new Espresso(100);
		espresso.addExtraCoffee();
		System.out.println(espresso.totalPrice());
		
		System.out.println("======================================");
		
		System.out.println("Latte Details: ");
		Latte latte = new Latte(120);
		latte.addExtraMilk();
		latte.addExtraCoffee();
		System.out.println(latte.totalPrice());
		
	}

}
