package spring.dependency.objects;

public class Bike {
	
	Engine engine;

	public Bike(Engine engine) {
		this.engine = engine;
		System.out.println("Bike Constructor Called..");
	}
	
	public void startEngine() {
		if(engine == null)
			System.out.println("unable to start engine");
		else
			engine.start();
	}

}
