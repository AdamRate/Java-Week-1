package Garage;

public class Bicycle extends Vehicle {
	public int pedals;

	public Bicycle(int wheels, int seats, int age, boolean engine, int pedals) {
		super( wheels, seats, age, engine);
		this.pedals = pedals;

	}
	public String toString() {return "Vehicle No: " + this.vehicleId + "\nWheels: " + this.wheels + "\nSeats: " + this.seats + "\nAge: " + this.age + "\nEngine: " + this.engine + "\nPedals: " + this.pedals;}

	
}

