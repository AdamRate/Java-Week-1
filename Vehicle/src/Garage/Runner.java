package Garage;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		GarageClass garage = new GarageClass();
		garage.addVehicle(new Car(1,1,1,true,1));
		garage.addVehicle(new Car(1,1,1,true,1));
		garage.listVehicles();
		garage.calcBill(0);
		garage.calcBill(1);
		garage.calcBill(2);
		garage.calcBill(3);
		garage.calcBill(4);
		garage.calcBill(5);
	}


}
