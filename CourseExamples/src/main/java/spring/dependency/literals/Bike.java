package spring.dependency.literals;

public class Bike {
	String color;

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void showColor() {
		System.out.println("Bike Color : "+color);
	}

}
