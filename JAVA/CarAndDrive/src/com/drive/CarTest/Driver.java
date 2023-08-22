package com.drive.CarTest;

public class Driver extends CarAndDrive {

	public void drive() {
		setGasLevel(getGasLevel()-1);
		System.out.println("you drive the car \n Gas remaining: " + getGasLevel()+ "/10" );
		
	}
	public void bousters() {
		setGasLevel(getGasLevel()-3);
		System.out.println("you are using bousters \n Gas remaining: " + getGasLevel()+ "/10" );
		
	}
	public void refuel() {
		setGasLevel(getGasLevel()+3);
		System.out.println("you are refueling the car \n your gas level is : " + getGasLevel()+ "/10" );
		
	}
}
