package com.solid.dip.good;

public class TalkingBot implements Bot{
	public void talk() {
		System.out.println("I am talking bot");
	}

	@Override
	public void perfrom() {
		this.talk();
	}
}
