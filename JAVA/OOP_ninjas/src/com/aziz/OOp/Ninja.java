package com.aziz.OOp;

public class Ninja {

		private int health;
		private String name;
		private int power;
		private boolean graduated;
		
		
		public int getHealth() {
			return health;
		}

		public void setHealth(int health) {
			this.health = health;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPower() {
			return power;
		}

		public void setPower(int power) {
			this.power = power;
		}

		public boolean isGraduated() {
			return graduated;
		}

		public void setGraduated(boolean graduated) {
			this.graduated = graduated;
		}

		public Ninja(){
			this.name = "unknown";
			this.health = 120;
			this.power = 10;
			this.graduated = false;
		}
		


}
