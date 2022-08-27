package com.solid.dip.good;

public class WalkingBot implements Bot {
	public void walk() {
		System.out.println("I am a walking bot");
	}

	@Override
	public void perfrom() {
		this.walk();
	}
}
