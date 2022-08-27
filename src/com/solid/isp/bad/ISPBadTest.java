package com.solid.isp.bad;

public class ISPBadTest {

	public static void main(String[] args) throws Exception{
		System.out.println("Espresso Details: ");
		Coffee espresso = new Espresso(100);
		espresso.addExtraCoffee();
		//espresso.addExtraMilk();
		System.out.println(espresso.totalPrice());
		
		System.out.println("======================================");
		
		System.out.println("Latte Details: ");
		Coffee latte = new Latte(120);
		latte.addExtraMilk();
		latte.addExtraCoffee();
		System.out.println(latte.totalPrice());
		
	}

}
