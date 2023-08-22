package com.zooKeper.mamal;

public class Bat {

	private int energy;
	
	public Bat() {
		this.energy = 300;
	}

	public void fly() {
		setEnergy(getEnergy()-50);
		System.out.println("the giant is flying run away !! \n his energy level now is: "+ getEnergy());
	}
	
	public void eatHuman() {
		setEnergy(getEnergy()+25);
		System.out.println("the giant bat just eated a human runnnnn!! \n his current energy now is: " + getEnergy() );
	}
	
	public void atackTown() {
		setEnergy(getEnergy()-100);
		System.out.println("the giant bat just attacked a town \n his current energy now is: " + getEnergy());
	}
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
