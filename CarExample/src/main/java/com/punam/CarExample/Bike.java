package com.punam.CarExample;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("Ram is driving Bike");
	}

}
