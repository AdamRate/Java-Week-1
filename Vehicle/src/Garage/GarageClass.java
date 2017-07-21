package Garage;

import java.util.ArrayList;

public class GarageClass {

	public ArrayList<Vehicle> Garage = new ArrayList<>();
	{
		Garage.add(new Car(4, 4, 4, true, 4));
		Garage.add(new Bicycle(2, 1, 7, false, 2));
		Garage.add(new Van(4, 3, 5, true, 4, 20.5));
		Garage.add(new Car(4, 5, 20, true, 4));
		Garage.add(new Bicycle(2, 1, 1, false, 2));
		Garage.add(new Van(4, 5, 10, true, 3, 50.5));
		Garage.add(new Car(3, 4, 5, true, 4));
	}

	public void addVehicle(Vehicle vehicle4) {
		Garage.add(vehicle4);
	}

	public void removeVehicle(int vehicleId) {
		Garage.remove(vehicleId);
	}

	public void emptyGarage() {
		Garage.clear();
	}

	public String calcBill(int vehicleId) {
		Vehicle Test = Garage.get(vehicleId);
		double priceTotal = 0;

		if (Test instanceof Car) {
			int wheelNum = Test.wheels;
			int seatsNum = Test.seats;
			int ageR = Test.age;
			boolean engineR = Test.engine;
			int doorNum = ((Car) Test).doors;

			if (engineR) {
				priceTotal = (wheelNum * 50) + (seatsNum * 20) * 
							 (ageR / 10) + 200 + doorNum * 25;
			} else if (!engineR) {
				priceTotal = (wheelNum * 50) + (seatsNum * 20) * 
							 (ageR / 10) + 20 + doorNum * 25;
			}
			System.out.println("£: " + priceTotal);
		}

		else if (Test instanceof Bicycle) {
			int wheelNum = Test.wheels;
			int seatsNum = Test.seats;
			int ageR = Test.age;
			boolean engineR = Test.engine;
			int pedalNum = ((Bicycle) Test).pedals;

			priceTotal = (wheelNum * 50) + (seatsNum * 20) * (ageR / 10) + 20 + pedalNum * 25;
			System.out.println("£: " + priceTotal);
		}

		else if (Test instanceof Van) {
			int wheelNum = Test.wheels;
			int seatsNum = Test.seats;
			int ageR = Test.age;
			boolean engineR = Test.engine;
			int doorNum = ((Van) Test).doors;
			double storeSize = ((Van) Test).storageSize;

			if (engineR) {
				priceTotal = (wheelNum * 50) + (seatsNum * 20) * (ageR / 10) + 200 + doorNum * 25 + storeSize * 10;
			} else if (!engineR) {
				priceTotal = (wheelNum * 50) + (seatsNum * 20) * (ageR / 10) + 20 + doorNum * 25 + storeSize * 10;
			}
			System.out.println("£: " + priceTotal);
		}
		return null;

	}

	public void listVehicles() {
		for (int i = 0; i < Garage.size(); i++) {
		
			Garage.get(i).printDetails();

			}

		}// "Vehicle " + vehicleId +"\n"+ Garage.get(vehicleId);
}


