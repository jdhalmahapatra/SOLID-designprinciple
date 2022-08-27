package com.solid.lsp.good;

public abstract class Herbivore extends Animal{

	@Override
	public void eat() {
		this.eatGrass();
	}
	
	public abstract void eatGrass();
	
}
