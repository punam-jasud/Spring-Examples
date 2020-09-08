package spring.dependency.objects;

public class Car {
	
	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car Constructor Called..");
	}
	
	public void startEngine() {
		if(engine == null)
			System.out.println("unable to start engine");
		else
			engine.start();
	}

}
