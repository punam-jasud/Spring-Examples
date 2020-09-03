package com.myproject.ConstructorInjection_Example;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Default Constructor..");
	}
	
	public Employee(int id) {
		this.id = id;
	}
	

	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void displayDetails()
	{
		System.out.println("Id : "+id+"\nName : "+name);
	}
}