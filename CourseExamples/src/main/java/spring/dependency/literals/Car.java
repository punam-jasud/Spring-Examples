package spring.dependency.literals;

public class Car {
	
	String color;

	public Car(String color) {

		this.color = color;
	}
	
	public void showColor() {
		System.out.println("Car Color : "+color);
	}

}
