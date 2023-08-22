package com.zooKeper.mamal;

public class Gorrila extends Mammal  {

	
//	public Gorrila() {
//		getEnergy();
//	}
//	
	public void throwSomething() {
		setEnergy(getEnergy()-5);
		System.out.println("the gorrila throwed a rock on the human \n his energy level is: "+ getEnergy());
	}
	public void eatBanana() {
		setEnergy(getEnergy()+10);
		System.out.println("the gorrila has eaten a banana and he is so happy!! \n his energy level now is: "+getEnergy());
	}
	public void climb() {
		setEnergy(getEnergy()-10);
		System.out.println("the gorrila is climbing a tree and he's having fun his current energy is :" + getEnergy());
	}
	
	
	
//	public  getGorrilaEnegy() {
//		return gorrilaEnergy;
//	}
//
//	public void setGorrilaEnegy(int gorrilaEnergy) {
//		this.gorrilaEnergy = gorrilaEnergy;
//	}
//	
	
}
