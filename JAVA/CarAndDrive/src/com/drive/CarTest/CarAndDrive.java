package com.drive.CarTest;

public class CarAndDrive {
	private int gasLevel = 10;
	
	
	public void display() {
		System.out.println("your remaining gas is :" + gasLevel );
	}


	public int getGasLevel() {
		return gasLevel;
	}


	public void setGasLevel(int gasLevel) {
		this.gasLevel = gasLevel;
	}
	
	
}
