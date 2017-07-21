package Garage;

public class Van extends Vehicle {
	public int doors;
	public double storageSize;

	public Van(int wheels, int seats, int age, boolean engine, int doors, double storageSize){
		super(wheels, seats, age, engine);
		this.doors = doors;
		this.storageSize = storageSize;
	}
	public String toString() {return "Vehicle No: " + this.vehicleId + "\nWheels: " + this.wheels + "\nSeats: " + this.seats + "\nAge: " + this.age + "\nEngine: " + this.engine + "\nDoors: " + this.doors + "\nStorage Space: " + this.storageSize;}

}
