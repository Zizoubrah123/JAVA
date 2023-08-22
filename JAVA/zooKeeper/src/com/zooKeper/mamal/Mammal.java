package com.zooKeper.mamal;

public class Mammal {
	
	private int energy = 100;
	
	
	public int display() {
		System.out.println("The remaining energy is: " + getEnergy());
		return energy;
	}


	public int getEnergy() {
		return energy;
	}


	public void setEnergy(int energy) {
		this.energy = energy;
	}


}
