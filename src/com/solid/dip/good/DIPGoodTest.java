package com.solid.dip.good;

public class DIPGoodTest {

	public static void main(String[] args) {
		Bot wBot = new WalkingBot();
		wBot.perfrom();
		
		Bot tBot = new TalkingBot();
		tBot.perfrom();
	}
}
