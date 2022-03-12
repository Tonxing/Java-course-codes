package com.mmtonsing.oops;

public class MotorBikeRunner {
public static void main(String[] args) {
	MotorBike ducati = new MotorBike(50);
	MotorBike honda = new MotorBike(25);
	MotorBike yamaha = new MotorBike();
	ducati.start();
	honda.start();
	
	ducati.setSpeed(100);
	
	ducati.increaseSpeed(25);
	honda.increaseSpeed(55);
	
	ducati.decreaseSpeed(25);
	honda.decreaseSpeed(55);
	
	System.out.println("ducati speed " + ducati.getSpeed());
	System.out.println("honda speed " + honda.getSpeed());
	System.out.println("yamaha speed " + yamaha.getSpeed());
}
}
