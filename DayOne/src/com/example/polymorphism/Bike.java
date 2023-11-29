package com.example.polymorphism;

public class Bike {
	
	protected int gear;
	protected int speed;
	public Bike(int startGear, int startSpeed) {
		gear=startGear;
		speed=startSpeed;
		
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	public void speedup(int increment) {
		speed += increment;
	}
}
