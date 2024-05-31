package abstraction;

abstract class vehicle{
	abstract void start();
}

class car extends vehicle{

	@Override
	void start() {
		System.out.println("Car starts with starter");
	}
	
}

class bike extends vehicle{
	@Override
	void start() {
		System.out.println("Bike starts with kick as well as starter");	
	}
}

public class Abstraction {

	public static void main(String[] args) {
		car c = new car();
		bike b = new bike();
		
		c.start();
		b.start();
	}

}
