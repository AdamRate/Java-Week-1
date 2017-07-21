package Garage;

public class Vehicle {
	private static int totalVehicles;
	public int vehicleId;
	public int wheels;
	public int seats;
	public int age;
	public boolean engine;

	public Vehicle(int wheels, int seats, int age, boolean engine) {
		totalVehicles++;
		this.vehicleId = totalVehicles;
		this.wheels = wheels;
		this.seats = seats;
		this.age = age;
		this.engine = engine;
	}

	public void printDetails() {
		System.out.println(toString() + "\n");
	}

	public String toString() {
		return "Vehicle No: " + this.vehicleId + "\nWheels: " + this.wheels + "\nSeats: " + this.seats + "\nAge: "
				+ this.age + "\nEngine: " + this.engine;
	}
}