package com.mmtonsing.oops;

public class MotorBike {
	//state
	private int speed;//member variable
	
	
	MotorBike(){//default constructor
		this(5);//calling another constructor
	}
	
	MotorBike(int speed){//constructor
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
		}
		else {
			System.out.println("invalid.");
		}
	}

	public void increaseSpeed(int howMuch){
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch){
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("Bike started");
	}
}
