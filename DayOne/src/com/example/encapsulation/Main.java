package com.example.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student("Aditya",26,"Pune");
		
		//System.out.println("Student name:" +student.getName());
		//System.out.println("Student age: " +student.getAge());
		//System.out.println("Student address: "+ student.getAddress());
		
		student.setName("Akshay");
		student.setAge(23);
		student.setAddress("Aurangabad");
		
		
		System.out.println("Student: "+student.getName());
		System.out.println("Age: "+student.getAge());
		System.out.println("Address: "+student.getAddress());
		

	}

}
