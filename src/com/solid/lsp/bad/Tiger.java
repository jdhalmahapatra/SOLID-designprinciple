package com.solid.lsp.bad;

public class Tiger extends Animal{

	@Override
	public void eatGrass() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Hey I am Tiger!! I won't eat grass, I only eat meat");
	}

}
