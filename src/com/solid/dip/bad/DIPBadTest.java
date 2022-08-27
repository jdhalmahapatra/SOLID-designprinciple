package com.solid.dip.bad;

public class DIPBadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WalkingBot wBot = new WalkingBot();
		TalkingBot tBot = new TalkingBot();
		
		wBot.walk();
		tBot.talk();
	}

}
