package com.example.polymorphism;

public class RoyalEnfield extends Bike{
	
	public int mileage;

	public RoyalEnfield(int startGear, int startSpeed, int startMileage) {
		super(startGear, startSpeed);
		mileage = startMileage;
	}
		
	
	public void setMileage(int newValue) {
		mileage = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue+2;
	}
	public void speedUp(int increment) {
		speed = speed+increment+10;
	}
	public void applyBreak(int decrement) {
		speed = speed-decrement-10;
	}
	
}
