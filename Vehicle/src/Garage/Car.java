package Garage;

public class Car extends Vehicle {
	public int doors;

	public Car(int wheels, int seats, int age, boolean engine, int doors) {
		super(wheels, seats, age, engine);
		this.doors = doors;
	}

public String toString() {return 	"Vehicle No: " + this.vehicleId + "\nWheels: " + 
									this.wheels + "\nSeats: " + this.seats + "\nAge: " +
									this.age + "\nEngine: " + this.engine + "\nDoors: " + 
									this.doors;}
	
}
