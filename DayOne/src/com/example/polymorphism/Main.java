package com.example.polymorphism;

public class Main {
	public static void main(String args[]) {
//		
//		Bike bike = new Bike(2,10);
//		
//		System.out.println("Bike gear is: "+bike.gear);
//		System.out.println("Bike Speed is :"+bike.speed);
//		
//		bike.applyBreak(1);
//		System.out.println("Bike speed after applying break is: "+ bike.speed);
//	
	
			Bike royal = new RoyalEnfield(5,50,50);
			
			System.out.println("Bike gear is :" +royal.gear);
			System.out.println("Bike speed is :" +royal.speed);
			
			royal.applyBreak(2);
			
			System.out.println("Bike speed after applying break :"+ royal.speed);
			
			royal.speedup(10);
			System.out.println("Bike speed after increment :"+ royal.speed);
			
			
			
	}		

}
